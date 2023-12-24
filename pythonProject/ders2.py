liste1=[]
liste2=[1,2,3]
liste3=[1,'iki',2.14]

print(liste1)
print(liste2)
print(liste3)

print('Eleman sayısı=',len(liste3), 'tür')

for i in range(len(liste3)):
    print(liste3[i])

for j in liste3:
    print(j)

for i in range(len(liste3)):
    liste3[i]=i*5
print(liste3)

for j in liste3: #atama yapmadığımız için çıktıda 0 5 10 olarak gözükür liste3 diyerek eşitlesek o zaman çıktı da dedğişirdi.
    j=j*10

print(liste3)

liste4=[1,3,6,8,44,6,8,15,19]
print(liste4)
print(liste4[3:7:2]) #3ten  7. indise kadar 2 şer 2 şer artarak git

print(liste4[2:5])
print(liste4[5:])
print(liste4[:3])
print(liste4[::-1])
print(liste4[::2])

liste4[3:7:2]=[55,66]
print(liste4)

# liste4[::-1]=[1,2,3,4,5,6,7]
# print(liste4)

# liste4.append(80)
# print(liste4)

liste5=liste4+[1,3]
print(liste5)

liste4.insert(3,16)
print(liste4)

liste4.remove(8)
print(liste4)

del liste4[0]
print(liste4)

#print(liste4.index(1,1))

liste5=[1,2,3,4,5]
liste6=liste5
liste6[2]=33
print(liste5)
liste7=liste6.copy()
liste7[2]=55

# eşitleme yapıp değişkenlerle oynadıktan sonra
# orjinali de değiştirebiliriz. copy kullanarak
# yaptığımız işlemlerde orjinal orjinalliğini korur. kopyaladaığımızda yaptığımız
# değişiklikler orjinali etkilemez.
print('*'*30)

print(liste5)
print(liste6)
print(liste7)

print(min(liste7))
print(max(liste7))

liste8=["elma","armut","karpuz"]
print('minimum',min(liste8))
print('maximum',max(liste8))

print('eleman toplamı=',sum(liste7))

liste10=[i*3 for i in range(5) if i<3]
print(liste10)
print('*'*50)


liste9=[i*3 for i in range(5) if(i<3)]
print((liste9))

demet1=(1,'iki',3.14)
print(type(liste10))
print(type(demet1))
print(demet1)
aaa=list(demet1)
print(type(aaa))
print(aaa)
aaa[1]=3
print(aaa)

print('*'*50)
#{ } sözlük için kullanılır

sozluk1={'a':'aaa','b':2,'c':'ccc'}
print(sozluk1)
print(sozluk1['c']) #valuesini yazdırdı

print('*'*50)

print(sozluk1['b'])
sozluk1["d"]=80
sozluk1["b"]='bbb'
print(sozluk1)

print('*'*50)

del sozluk1['d']
print(sozluk1)

print('*'*50)

for i in sozluk1:
    print(i)

for i in sozluk1.keys():
    print(i)

for i in sozluk1.values():
    print(i)

print('*'*50)

print('a' in sozluk1)
print('z' in sozluk1)

print('*'*50)

sozluk2={'d':'ddd','b':3.4}
print(sozluk1)
sozluk1.update(sozluk2)
print(sozluk1)



