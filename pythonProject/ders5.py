import numpy as np
a=np.array([[1,2,3,4],[5,6,7,8],[9,10,11,12]])
# print(a)
# print(a.shape)

b=a[1:3,2:4]
# print(b)
#
c=a[1,:]
# print(c)
#
d=a[:,:]
# print(d)
#
e=a[1,-3:-1]
# print(e)
#
# print('*'*50)
# print(a)
f1=a[1,1:3]
# print(f1)
# print(f1.shape)
f2=a[[1],1:3]
# print(f2)
# print(f2.shape)
pp=np.array([[8]])
# print(pp)
# print(pp.shape)
# print(f1)
# print(f1.shape)
f3=f1[:,np.newaxis]
# print(f3)
# print(f3.shape)

f4=f1[np.newaxis,:]
# print(f4)
# print(f4.shape)
#
f5=f1.reshape((2,1))
# print(f5)
# print(f5.shape)
#
f6=f5.squeeze()
# print(f6)
# print(f6.shape)
#
# print('*'*50)
# g1=np.zeros((3,4))
# print(g1)
# print(g1.shape)
# print(g1.dtype)
#
# g3=np.arange(2,8,3)
# print(g3)
# print(g3.shape)
#
g4=np.arange(-2,2-0.5)
# print(g4)
# print(g4.shape)
#
g5=np.linspace(-2,2,19)
# print(g5)
# print(g5.shape)
#
# print('*'*50)
#
h1=np.array([[1,2,3],[4,5,6]])
print(h1)
h2=np.array([[7,8,9]])
print(h2.shape)
#
# h3=np.concatenate((h1,h2),axis=0)
# print(h3)
# print(h3.shape)
#
# sonuc=[]
# for i in range(10):
#     sonuc.append(i)
#
# print(sonuc)
#
# sonuc2=np.empty((0,1))
# for i in range(10):
#     sonuc2=np.concatenate((sonuc2,np.array([[i]])),axis=0)
#
# print(sonuc2)
# print(sonuc2.shape)
# print(sonuc2.dtype)
#
#
# sonuc3=sonuc2.astype(np.int8)
# print(sonuc3)
# print(sonuc3.dtype)
#
