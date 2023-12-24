def mesajyaz():
   print('merhaba')

mesajyaz()
mesajyaz()

def topla(a,b):
   sonuc=a+b
   #print(sonuc)
   return sonuc #fonkdaki son komut altındaki sonuçlar çalışmaz

#topla(5,7)
print('işlem sonucu = ',topla(3,5))
aa=topla(3,5)
print('işlem sonucu = ',aa)


def cokluIslem(a,b):
    toplam = a+b
    carpim = a*b
    fark = a-b
    return toplam,fark,carpim

a2,b2,c2=cokluIslem(3,4)
a3,b3,c3=cokluIslem(3,4)

print([a2,b2,c2])
print([a3,b3,c3])

def deneme(a,b):
    r1=a+b
    r2=a*b
    r3=a-b
    return r1,r2,r3

f1,f2,f1 = deneme(2,5) #f1 in üstüne yazar       # ya da ,f2, = deneme(5,7)   print([f2])
print([f1,f2])

a4,b4,c4 = cokluIslem(b=5,a=3)
print([a4,b4,c4])


def coklu_topla(*a):
    sonuc=0
    for i in a:
        sonuc += i
    return sonuc

print ('işlem sonucu = ',coklu_topla())
print ('işlem sonucu = ',coklu_topla(5))
print ('işlem sonucu = ',coklu_topla(5,6))
print ('işlem sonucu = ',coklu_topla(3,4,5,6,7,8,4,7,2))


def fakt (n):
    if n==0 or n==1:
        return 1
    else:
        return n*fakt(n-1)

sayi=999 #recursive sınırı 999 old. için 1000 i hesaplamaz
print(sayi,' faktöriyel = ',fakt(sayi))



import numpy as np
bbb = np.array([1,2,3])
print(bbb)


import matplotlib.pyplot as plt
plt.plot([1,3,5],[6,8,9])
plt.show()

def fibo (n):
    if(n<=1):
        return(n)
    else:
        return fibo(n-1)+fibo(n-2)

fib_liste=[]
for i in range(30):
    fib_liste.append(fibo(i))

print(fib_liste)
print(fibo(30))


