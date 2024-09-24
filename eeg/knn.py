import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.impute import SimpleImputer
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import confusion_matrix, accuracy_score, classification_report
import matplotlib.pyplot as plt
import seaborn as sns


# CSV dosyasını yükle
data = pd.read_csv("EEG_Eye_State_Classification.csv")

# Veri setinde null değerleri bul ve say
null_values = data.isnull().sum().sum()
print("Null değerlerin sayısı:", null_values)

# Null değerler varsa uygun bir şekilde doldur
if null_values > 0:
    # Null değerleri uygun bir şekilde doldur (örneğin, ortalama veya medyan ile)
    data.fillna(data.mean(), inplace=True)  # Ortalama ile dolduruldu, bu başka bir strateji de olabilir

# Geçersiz karakter içeren verileri temizle
cleaned_data = data.dropna()

# Temizlenmiş verinin boyutunu kontrol et
print("Temizlenmiş veri setinin boyutu:", cleaned_data.shape)


# Verinin ilk 5 satırını görüntüle
print(data.head())

X = data.drop("eyeDetection", axis=1)  # Öznitelikler
y = data["eyeDetection"]               # Hedef değişken


X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)


# Modeli oluştur
knn = KNeighborsClassifier(n_neighbors=5)  # K = 5 olarak başlayalım

# Modeli eğit
knn.fit(X_train, y_train)

# Modeli değerlendir
accuracy = knn.score(X_test, y_test)
print("Test veri kümesi doğruluk değeri:", accuracy)


# Test veri kümesi üzerinde tahmin yap
y_pred = knn.predict(X_test)

# Karmaşıklık matrisini hesapla
cm = confusion_matrix(y_test, y_pred)
print("Karmaşıklık Matrisi:")
print(cm)

# Sınıflandırma raporunu görüntüle
print("\nSınıflandırma Raporu:")
print(classification_report(y_test, y_pred))

# Doğruluk oranını hesaplama
accuracy = accuracy_score(y_test, y_pred)
print(f'Model Doğruluk Oranı: {accuracy:.4f}')

# Confusion matrix görselleştirme
plt.figure(figsize=(8, 6))
sns.heatmap(cm, annot=True, fmt="d", cmap="Blues", xticklabels=["Closed", "Open"], yticklabels=["Closed", "Open"])
plt.ylabel('Gerçek Durum')
plt.xlabel('Tahmin Edilen Durum')
plt.title('Confusion Matrix')
plt.show()