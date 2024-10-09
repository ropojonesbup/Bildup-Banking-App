string customerFirstname;
string customerLastname = "";
string customerGender = "";
string customerAddress = "";
string customerAge = "";
string accountNumber = "";
int accountBalance = "";
string customerBVN = "";
string customerNIN = "";
 
Console.Clear();
Console.WriteLine("******************");
Console.WriteLine("Welcome to SEAP-Fi");
Console.WriteLine("******************");

Console.WriteLine();
Console.Beep();
Console.WriteLine("Please select an option:\n\n" +
                    "1. Onboard customer.\n" +
                    "2. Open customer account.\n" +
                    "3. Deposit to customer account.\n" +
                    "4. Withdraw from customer account.\n" +
                    "5. Transfer to other account.\n" +
                    "6. Close an account.\n" +
                    "7. Exit application.\n" 
                );


Console.Write("Option: ");
Console.ReadLine();
Console.Beep();
