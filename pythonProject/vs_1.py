# loc kullanılacaksa satırlarda ve sütunlarda yazan değişkenleri göz önüne alarak girmeliyiz ama ilocta 0.
# indisten başladığı için direkt 0 yazabilirsin
# locta zero two dersem iki dahil olur ama ilocta 0,2 dersek o zaman 2 dahil olmaz
import pandas as pd

df1=pd.read_csv('googleplaystore.csv') #.values values ile numpy array olur sadece içerik okumak için tercih edilebilir
print(df1.shape)
print(df1.dtypes)
print(type(df1))
print('-'*50)
print(df1.columns)
print('-'*50)

movies_df=pd.read_csv('IMDB-Movie-Data.csv')
print (movies_df.shape)
print (movies_df.columns)
print('-'*50)

print(df1.head())
print(df1.tail(2)[['Category','Rating']])
print('-'*50)


print(df1.iloc[10835:10840]) #840 gelmedi çünkü ilocta dahil edilmez.
print(df1.loc[:,'Size':'Genres'])#genres alınır çünkü locta dahildir. başta : olma sebebi tüm satırları aldığı içindir.
print('-'*50)

print(df1.info())
print(movies_df.info())
print('-'*50)

print(df1.isnull().sum().sort_values(ascending=False)) #sütunlarda boş kalan yerleri verir ve büyükten küçüğe sıralar. true olsaydı o zaman k>b sıralardı.
print('-'*50)
print(df1.describe())
print(df1['Category'].describe())
print(df1.describe(include=['O']))#o harfi olduğu için iki saat hata aldık ama düzelttim.
print(df1['Category'].value_counts())

print(df1[df1['Category']=='1.9'])
df1._set_value(10472,'Category','PHOTOGRAPHY')
print(df1['Category'].value_counts())
print(df1.sort_values(by='Rating',ascending=False).head(10))

df1.drop(10472,inplace=True)
print(df1.sort_values(by='Rating',ascending=False).head(10)[['App','Rating']])
df1.drop('Content Rating',axis=1,inplace=True)
print(df1.columns)

print(df1.groupby('Category')['Rating'].mean().head(4))
print(df1.info())
df1['Rating'].fillna(df1.groupby('Category')['Rating'].transform('mean'),inplace=True)
print(df1.info())
print(df1.isnull().sum().sort_values(ascending=False))
df1.dropna(inplace=True)







