a=3
print(a)

b=c=d=5
print(b)
print(c)
print(d)

e,f,g=10,20,30
print(e)
print(f)
e,f=f,e
print(e)
print(f)

e=g+30
print(e)
e+=8
print(e)

print("*"*50)

h=5
k=3.14
m=6+8j
print(h)
print(k)
print(m)
print([h,k,m])

print(m+k)

print('*'*50) #50 kere yap anlamında *50 koyduk

v1=True
v2=False
v3=2<3
print([v1,v2,v3])

print("*"*50)

# import numpy as np
# v5=np.array([1,2,3,4,5])
# print(v5)
# yy=v5>3
# print(yy)

print(type(v1))
print(type(m))

print("*"*50)

# m1=input('bir sayı giriniz: ')
# print(type(m1))
# m2=int(m1)
# m3=m2+8
# print('sonuc', m3)

y1=101
y2='merhaba'+str(101)
print(y2)

print("*"*50)

print(chr(78))

print("*"*50)

z1=0
z2=1
print([z1,z2])
z1=bool(z1)
z2=bool(z2)
print([z1,z2])

print("*"*50)


sayi=-7
if(sayi>0):
    print('sayı pozitiftir.')
elif(sayi<0):
    print('sayı negatiftir.')
else:
    print('sayı sıfırdır.')
print('kod sonlandı')

print("*"*50)

sayi2=7
if sayi2%2==0: print('sayı çifttir.')
else: print('sayı tektir.')

print("*"*50)

sayi3=1
while(sayi3<11):
    print(sayi3)
    sayi3+=1

print("*"*50)

for i in "abcd":
    print(i)
print("*"*50)

liste1=[20,2,5,9]
for j in liste1:
    print(j)
print("*"*50)
for i in range(3,23,4): #3 ten 23 e 4er 4er git
    print(i)
print("*"*50)

for j in range(5):
    for i in range(3,23,4):
        print(i)
        if(j==3):
            break
    print(j)

