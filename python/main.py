import winsound
import os
import random

clear = lambda: os.system ('cls')

# Customer Variables
customerFirstname = ""
customerLastname = ""
customerGender = ""
customerAddress = ""
customerAge = ""
accountNumber = ""
accountOpeningBalance = 5000
accountCurrentBalance = accountOpeningBalance 
customerBVN = ""
customerNIN = ""

# Bank Variables
amountWithdraw = 0
accountLimit = 1000.00

while (True):
    clear()
    print("")
    winsound.Beep(2500, 1500,)
    print("******************")
    print("Welcome to SEAP-Fi ")
    print("*******************")
    print("")
    print("Nigeria's best mobile banking platform")
    print("")
    print("Please select an option:")
    print("")
    print("1. Customer Onboarding")
    print("2. Account Opening")
    print("3. Deposit to Account")
    print("4. Withdrawal from Account")
    print("5. Transfer to other Accounts")
    print("6. Account Closing")
    print("7. Exit application")
    print("8. Login or signout ")

    print("Option: ")
    print("")

    option = int (input("Option: "))

    match (option):

        case 1:
            winsound.Beep(2500, 1500,)
            print("Bildup Banking - Customer Onboarding")
            print("************************************")
            print("")
        
            customerFirstname = input("Firstname: ")
            customerLastname = input("Lastname: ")
            customerGender = input("Gender: ")
            customerAddress = input("Address: ")
            customerAge = input("Age: ") 
            customerBVN = input("BVN: ")
            customerNIN = input("NIN: ")
            
        case 2:
           winsound.Beep(2500, 1500,)
           print("Bildup Banking - Account Opening")
           print("*********************************")
           print("")
           
           accountNumber = ''.join([str(random.randint(0,9)) for _ in range(10)])
           print(accountNumber)
           print(customerFirstname)
           print(customerLastname)
           print()
           input("Press enter to continue....")
            
        case 3:
            winsound.Beep(2500, 1500,)
            print("  '3'. Deposit to Account  ")
            
        case 4:
            winsound.Beep(2500, 1500,)
            print("  '4'. Withdrawal from Account  ")
            
        case 5:
            winsound.Beep(2500, 1500,)
            print("  '5'. Transfer to other Accounts  ")
        
        case 6:
            winsound.Beep(2500, 1500,)
            print("  '6'. Account Closing  ")
            
        case 7:
            winsound.Beep(2500, 1500,)
            print("  '7'. View all Transaction  ")
   
