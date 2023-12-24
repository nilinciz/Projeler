
import numpy as np
dizi0=[1,2,3,4]

dizi1=np.array(dizi0)
dizi2=np.array([2,4,6,8])

print(dizi0)
print(dizi1)
print(dizi2)

print(type(dizi0))
print(type(dizi1))
print(type(dizi2))

print('*'*50)

dizi3=np.array([1,2,3,4],dtype=np.uint8)
print(dizi3)
print(dizi3.ndim)
print(dizi3.shape)
print(dizi3.dtype)

dizi4=np.array([[1],[2],[3],[4]])
print(dizi4)
print(dizi4.ndim)
print(dizi4.shape)
print(dizi4.dtype)

dizi5=np.array([[1,2,3,4],[5,6,7,8],[9,10,11,12]])
print(dizi5)
print(dizi5.ndim)
print(dizi5.shape)
print(dizi5.dtype)


dizi6=np.array([[[1,2,3,4],[5,6,7,8]],[[9,10,11,12],[1,2,3,4]],
               [[13,23,33,43],[14,25,36,47]]])
print(dizi6)
print(dizi6.ndim)
print(dizi6.shape)
print(dizi6.dtype)
print(dizi6[1,0,3])
print(dizi6[0,1,2])

dizi7=np.array([1,2,3,4,5,6,7,8,9])
print(dizi7[2::2])
print(dizi7[-2:2:-2])
print(dizi7[-2::-2])

dizi8=np.array([[[1,2,3]]])
print(dizi8)
print(dizi8.ndim)
print(dizi8.shape)

dizi9=dizi8.squeeze()
print(dizi9)
print(dizi9.ndim)
print(dizi9.shape)


