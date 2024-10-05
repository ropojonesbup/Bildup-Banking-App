import os

def clear_screen():
    os.system('cls')
clear_screen()


print("******************************")
print("Welcome to SEAP-10 Banking App!")
print("******************************")
print("1. onboard Customer")
print("2. Open Customer Account")
print("3. Check Balance")
print("4. Deposit Customer Account")
print("5. Withdraw to Customer Account")
print("6. Transfer to other Account")
print("7. Close Account")
print("8. Exit")

option = input("Please enter your choice (1-8): ")

if option == '1':
    print("You selected to onboard a customer.")
elif option == '2':
    print("You selected to open a customer account.")


  