import numpy as np
import pandas as pd
iris1=pd.read_csv('iris.csv')
# iris1=pd.read_csv('iris.csv').values
print(iris1.head(2))
# print ('iris.csv') # yanlış okuma yapıldı


print('*'*50)

iris2=pd.read_csv('iris_withheader.csv')
print(iris2.head())

print('*'*50)

iris3=pd.read_csv('iris_withheaderandindex.csv',index_col='Id')
print(iris3.head())

print('*'*50)

movies_df=pd.read_csv('IMDB-Movie-Data.csv')
print (movies_df.head(5))
print(movies_df.columns)

import matplotlib.pyplot as plt
from matplotlib import pyplot as plt
# movies_df.plot(kind='scatter', x='Rating',y='Revenue',)
#kalp denklemi geçen sene sormuş

# movies_df.plot['Rating'].plot(kind='hist')
#  movies_df['Rating'].plot(kind='box')
#  plt.show()

# plt.clf()
# x1=[-6,-4,-2,0,2,4,6]
# y1=[36,16,4,0,4,16,36]
#
# x2=np.linspace(-6,6,100)
# y2=x2**2 #** üstü demektir.

# plt.plot(x1,y1)
# plt.plot(x2,y2)
# plt.waitforbuttonpress() kişi tuşa basınca çalışır
# plt.show()
# plt.close()

# plt.plot(y1)
# plt.show()
# plt.close()

plt.figure()
plt.show()

x1=np.arange(-10,10,0.1)
y1=x1**2
y2=-x1**2
plt.plot(x1,y1,color='purple',marker=0,linestyle='dashed')
plt.plot(x1,y2,'g*',linewidth=5)
plt.legend(['x^2 graph','-x^2 graph'])
plt.xlim(-10,10)
plt.ylim(-30,30)
plt.xlabel('x değerleri',fontsize=16)
plt.ylabel('y değerleri',fontsize=16)
plt.savefig('file.tiff',dpi=300)
plt.show()

# iller=['Adana','Erzurum','İzmir']
# sicaklik=[15,2,10]
# plt.bar(iller,sicaklik,color='pink')
# plt.show()









