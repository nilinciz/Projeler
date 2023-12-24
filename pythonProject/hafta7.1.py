import pandas as pd
import numpy as np

k1 = np.array([2,4,6,8])
# print(k1)

# k2 = pd.Series(data = k1 ,index=['s1','s2','s3','s4'], dtype=np.uint8)
k2 = pd.Series(k1)
# # k2 = pd.Series(k1 , dtype=np.uint8)
# print(k2)
# print(type(k2))
# print(k2.values)
# print(k2.index)

k3 = {'a':1,'b':3 ,'c':5,'d':7}
k4 = pd.Series(k3)
# print(k4)

k5 = k4 + k4
k6 = k4*3
k7 = k4.std() #standart sapma
# print(k5)
# print(k6)
# print(k7)

# print(k4)
# print(k4>4)
# print(k4[k4>4])

m1 = pd.Series([1,2,3,4,5],index=['z1','z2','z3','z4','z5'])
m2 = pd.Series(['a','b','c','d','e'],index=['z1','z2','z3','z4','z5'])
m3 = dict(numara = m1, isim = m2)
# print(m3)
m4 = pd.DataFrame(m3)
# print(m4)
m5 = pd.DataFrame({'no':m1,'ad':m2},index=['z1','z2','z3','z4','z5'])
# print(m5)
#
m5 = m5.set_index('no')
# print(m5)
# print(m5.values)
#
# #ekleme
m6 = m5._append(m5)
print(m6)
print(m6.columns)
m6.columns = ['isim']
print(m6)