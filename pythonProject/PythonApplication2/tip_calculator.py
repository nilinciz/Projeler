#NE KADAR BAH��� VER�LECE��N� BULAN PROGRAM
print("Welcome to the tip calculator!")
bill = float(input("What was the total bill?\n"))
tip = int(input("How much tip would you like to give? 10,12 or 15?\n"))
people = int(input("How mony people split the bill?\n"))
tip_as_percent = tip / 100
total_tip_amount = bill * tip_as_percent
total_bill = bill + total_tip_amount
bill_per_person = total_bill / people
final_amount = str(round(bill_per_person, 2))
print("Each person should pay: "+ final_amount)


