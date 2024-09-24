#TAÞ KAÐIT MAKAS OYUNU
import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''
choice=[rock,paper,scissors]
your_choice=input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors\n")

if your_choice=="0":
    print(rock)
elif your_choice=="1":
    print(paper)
elif your_choice=="2":
    print(scissors)

random_choice=str(random.randint(0,2))
print("Computer chose:")

if random_choice=="0":
    print(rock)
elif random_choice=="1":
    print(paper)
elif random_choice=="2":
    print(scissors)

if your_choice=="0" and random_choice=="0":
    print("Equal.")
elif your_choice=="0" and random_choice=="1":
    print("You lose.")
elif your_choice=="0" and random_choice=="2":
    print("You Win.")

if your_choice=="1" and random_choice=="0":
    print("You Win.")
elif your_choice=="1" and random_choice=="1":
    print("Equal.")
elif your_choice=="1" and random_choice=="3":
    print("You lose.")

if your_choice=="2" and random_choice=="0":
    print("You lose.")
elif your_choice=="2" and random_choice=="1":
    print("You Win.")
elif your_choice=="2" and random_choice=="2":
    print("Equal.")