import numpy as np
a = np.random.random((4,5))*7-2
print(a)

b = np.array([1,2,3,4,5,6,7,8])
c = b.reshape((4,2))
#print(c)

d = b.reshape((2,-1))
#print(d)

e = b.reshape((-1,1))
#print(e)

f = b.reshape((4,2))
#print(f)
f2  = f.T
#print(f2)

f3 = np.dot(f2,f)
#print(f3)

f4 = f3==100
#print(f4)
f3[f4] = 90
#print(f3)

"""
f5x , f5y = np.where(f3==90) #f5 = np.where(f3==90)
print(f5x)
print(f5y)
print(type(f5x))

f6 = np.concatenate((f5x.reshape((-1,1)),f5y.reshape((-1,1))),axis=1)
print(f6)

f3[f6[1,0],f6[1,1]] = 888
print(f3)
#np.save('denemezzzz.npy',f3)
abc = np.load('denemezzzz.npy')
print(abc)
"""

"""
g1 = np.array([[1,2,3],[4,5,6]])
g2 = np.array([[2,1,1],[2,3,1]])
print(g1)
print(g2)
print(g1+g2)
print(g1*g2)
print(g1/g2)
print(g1-g2)
print(g1*3)
print(g2-5)
"""

g2 = np.array([[2,1,1],[2,3,1]])
print(g2)
print(g2.sum(axis=1 , keepdims=True))

h1 = np.array([1,2,3,4,5,6,7])
print(h1.sum())
print(h1.std())
print(h1.mean())
print(np.median(h1))
print(np.exp(1))
print(np.sin(np.pi*3/2))