import numpy as np

a=(np.random.random((5,5))-0.5)*3
b=np.random.random((5,5))*3-1.5
print(a)
print(b)

c=np.array([1,2,3,4,5,6])
print(c)
c2=c.reshape((3,2))
c3=c.reshape((3,-1))
c4=c.reshape((1,-1))
print(c2)
print(c3)
print(c4)
print(c.shape)
print(c2.shape)
print(c3.shape)
print(c4.shape)
print('*'*50)

d=np.array([[1,2,3],[4,5,6]])
print(d)
d2=d.T
print(d2)
d3=np.dot(d2,d)
print(d3)

d4=np.array([[2,1,1],[3,1,2]])
print('*'*50)
print(d)
print(d4)
print(d+d4)
print(d*d4)
print(d/d4)
print(d*3)
print('*'*50)

f1=np.array([[1,2,3,4],[4,5,6,7],[2,4,6,8]])
print(f1)
print(f1==4)
#f1[f1==4]=80
print(f1)
x,y=np.where(f1==4)
z=np.concatenate((np.array(x).reshape((-1,1)),np.array(y).reshape((-1,1))),axis=1)
print(z.shape)
print(z)
print(f1)
f1[z[2,0],z[2,1]]=90
print(f1)

#np.save('deneme1.npy',f1)
g=np.load('deneme1.npy')
print(g)
print('*'*50)

h=np.array([1,2,3,4,5,6,7])
print(h)
print(h.mean())
print(h.std())
print(h.sum())
print(np.median(h))
print(np.exp(np.pi))
print(np.sin(np.pi/2))
print('*'*50)

import pandas as pd
t1=np.array([2,4,6,8,10])
ind=['a','b','c','d','e']
t2=pd.Series(data=t1,index=ind,dtype=np.uint8)
print(t2)
print(type(t2))

t3={'a1':10,'a2':20,'a3':30}
t4=pd.Series(t3)
print(t4)

print(t4.sum())
print(t4.std())
print(t4.median())
print(t4+t4)
print(t4*2)
print(t4*t4)

print(t4)
print(t4[t4>15])
print(t4>15)

print('*'*50)
a1=pd.Series([2,4,6,8],index=[0,1,2,3])
a2=pd.Series(['c2','c4','c6','c8'],index=[0,1,2,3])
a3=dict(one=a1,two=a2)
print(a3)
print(type(a3))
print('*'*20)
a4=pd.DataFrame(a3)
print(a4)
print(type(a4))

b1={'isim':['ali','veli','adnan'],'yas':[20,22,24],'numara':[2,4,6]}
b2=pd.DataFrame(data=b1,index=['z1','z2','z3'])
print(b2)

b2=b2.set_index('numara')
print(b2)
print(b2.values)
print(b2.columns)
print(b2.shape)
b2=b2.append(b2)
print(b2)
print(b2.shape)
print('*'*50)
b2.columns=['Name','Age']
print(b2)

vv=pd.DataFrame(data={'ddd':a1,'eee':a2})
print(vv)