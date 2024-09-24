#ÞÝFRE OLUÞTURUCU
import random

print("Welcome to the PyPassword Generator!" )

# Kullanýcýdan giriþleri al
letters_num=int(input("How many letters would you like in your password?\n"))
symbols_num=int(input("How many symbols would you like?\n"))
numbers_num=int(input("How many numbers would you like?\n"))

# Harfler, semboller ve rakamlar listesi
letters=["q","w","e","r","t","y","u","o","p","a","s","d","f","g","h","j","k","l","i","z","x","c","v","b","n","m"]
symbols=["!","'","^","+","%","&","/","(",")","=","?",">","<","#","$","{","[","]","}","|",".",",",":",";"]
numbers=[1,2,3,4,5,6,7,8,9,0]

# Parola oluþturmak için rastgele elemanlar seç
password_list=[]
for _ in range(letters_num):
    password_list.append(random.choice(letters))

for _ in range(symbols_num):
    password_list.append(random.choice(symbols))

for _ in range(numbers_num):
    password_list.append(random.choice(numbers))

# Karakterleri karýþtýr
random.shuffle(password_list)
password_str = ''
for item in password_list:
    password_str += str(item)

print("Your password is:", password_str)
