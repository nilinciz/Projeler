import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.metrics import confusion_matrix, accuracy_score
import matplotlib.pyplot as plt
import seaborn as sns
import tensorflow as tf
print(tf.__version__)
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import GRU, Dense, Dropout
from tensorflow.keras.optimizers import Adam
from tensorflow.keras.callbacks import EarlyStopping


# Veri setini yükle
data = pd.read_csv('C:/Users/nilin/PycharmProjects/pythonProject1/EEG_Eye_State_Classification.csv')

# Null değerlerin tespiti
print("Null değerlerin sayısı:\n", data.isnull().sum())


# Null değerlerin düzenlenmesi (eğer varsa, ortalama değer ile doldurulacak)
data = data.fillna(data.mean())

# Null değerlerin tekrar kontrol edilmesi
print("Null değerlerin düzenlenmesinden sonra:\n", data.isnull().sum())

# Özellikler ve hedef değişkenleri ayır
X = data.drop(columns=['eyeDetection'])
y = data['eyeDetection']

# Verileri ölçeklendir
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# Eğitim ve test kümelerine ayır
X_train, X_test, y_train, y_test = train_test_split(X_scaled, y, test_size=0.2, random_state=42)

# Verileri GRU'nun kabul edebileceği forma getirelim (samples, timesteps, features)
X_train = np.expand_dims(X_train, axis=1)
X_test = np.expand_dims(X_test, axis=1)


# GRU modelini oluştur
model = Sequential()
model.add(GRU(units=64, input_shape=(X_train.shape[1], X_train.shape[2]), return_sequences=True))
model.add(Dropout(0.2))
model.add(GRU(units=64, return_sequences=False))
model.add(Dropout(0.2))
model.add(Dense(units=1, activation='sigmoid'))

# Modeli derle
model.compile(optimizer=Adam(learning_rate=0.001), loss='binary_crossentropy', metrics=['accuracy'])

# Early stopping ile aşırı öğrenmeyi önleme
early_stopping = EarlyStopping(monitor='val_loss', patience=5, restore_best_weights=True)

# Modeli eğit
history = model.fit(X_train, y_train, epochs=50, batch_size=32, validation_split=0.2, callbacks=[early_stopping])

# Modeli değerlendirme
test_loss, test_accuracy = model.evaluate(X_test, y_test)
print(f'Test Doğruluğu: {test_accuracy:.4f}')

# Test seti üzerinde tahmin yapma
y_pred = (model.predict(X_test) > 0.5).astype("int32")


# Gerçek değerlerle tahmin edilen değerleri karşılaştırma
comparison = pd.DataFrame({'Gerçek Değerler': y_test, 'Tahmin Edilen Değerler': y_pred.flatten()})

# Anormal sonuçları bulma
anormal_sonuclar = comparison[comparison['Gerçek Değerler'] != comparison['Tahmin Edilen Değerler']]
print("Anormal Sonuçlar:\n", anormal_sonuclar)


# Confusion matrix oluşturma
conf_matrix = confusion_matrix(y_test, y_pred)

# Doğruluk oranını hesaplama
accuracy = accuracy_score(y_test, y_pred)
print(f'Model Doğruluk Oranı: {accuracy:.4f}')

# Confusion matrix görselleştirme
plt.figure(figsize=(8, 6))
sns.heatmap(conf_matrix, annot=True, fmt="d", cmap="Blues", xticklabels=["Closed", "Open"], yticklabels=["Closed", "Open"])
plt.ylabel('Gerçek Durum')
plt.xlabel('Tahmin Edilen Durum')
plt.title('Confusion Matrix')
plt.show()


# Eğitim ve doğrulama kayıplarını ve doğruluklarını grafikte gösterelim
plt.figure(figsize=(12, 4))

plt.subplot(1, 2, 1)
plt.plot(history.history['loss'], label='Eğitim Kaybı')
plt.plot(history.history['val_loss'], label='Doğrulama Kaybı')
plt.xlabel('Epok')
plt.ylabel('Kayıp')
plt.legend()
plt.title('Eğitim ve Doğrulama Kaybı')

plt.subplot(1, 2, 2)
plt.plot(history.history['accuracy'], label='Eğitim Doğruluğu')
plt.plot(history.history['val_accuracy'], label='Doğrulama Doğruluğu')
plt.xlabel('Epok')
plt.ylabel('Doğruluk')
plt.legend()
plt.title('Eğitim ve Doğrulama Doğruluğu')

plt.show()

from sklearn.metrics import precision_score, recall_score

# Test seti üzerinde tahmin yapma
y_pred_prob = model.predict(X_test)
y_pred = (y_pred_prob > 0.5).astype(int)

# Precision ve Recall değerlerini hesaplama
precision = precision_score(y_test, y_pred)
recall = recall_score(y_test, y_pred)

print("Precision:", precision)
print("Recall:", recall)
