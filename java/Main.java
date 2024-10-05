import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("*********************\nWELCOME TO SEAP-Fi\n*******************");
        System.out.println();

        System.out.println("Please select an option:\n");
        System.out.println("1. Onboard customer.\n" +
                            "2. Open customer account.\n"+ 
                            "3. Deposit to customer account.\n"+
                            "4. Widthdraw from customer account.\n"+ 
                            "5. Transfer to other accounts.\n"+
                            "6. Close an account.\n"+
                            "7. Exit application.\n");

    System.out.println("Option:\n");                      
    Scanner customerinput = new Scanner(System.in);
    int option=customerinput.nextInt();
    customerinput.nextLine();

    while (option >=1 && option<= 8) {// the code will continue to run until the condition is false
        switch (option){
            case 1:
                System.out.println("ENTER YOUR FULLNAME");
                String fullname = customerinput.nextLine();
                System.out.println(fullname+"you have successfully onboarded");

            case 2:
                System.out.print("Enter account type (Savings/Current): ");
                String accountType = customerinput.nextLine();
                System.out.println(accountType + " account opened successfully.");
                break;

            case 3:
                    System.out.print("Enter deposit amount: ");
                    double deposit = customerinput.nextDouble();
                    System.out.println("You have deposited " + deposit + " into your account.");
                    break;

            case 4:
                    System.out.print("Enter withdrawal amount : ");
                    double withdrawal = customerinput.nextDouble();
                    System.out.println("You have withdrawn " + withdrawal + " from your account.");
                    break;
                case 5:
                    System.out.print("Enter transfer amount: ");
                    double transfer = customerinput.nextDouble();
                    customerinput.nextLine(); // Consume newline
                    System.out.print("Enter account number to transfer to: ");
                    String accountNumber = customerinput.nextLine();
                    System.out.println("You have transferred " + transfer + " to account number " + accountNumber + ".");
                    break;
                case 6:
                    System.out.print("Are you sure you want to close your account? (yes/no): ");
                    String confirmation = customerinput.nextLine();
                    if (confirmation.equalsIgnoreCase("yes")) {
                        System.out.println("Your account has been closed successfully.");
                    } else {
                        System.out.println("Account closing cancelled.");
                    }
                    break;
                case 7:
                    System.out.println("Displaying all transactions...");
                    // In a real app, this would fetch transaction history
                    break;
                case 8:
                System.out.println("Are you sure you want to end operation?(yes/no):");
                String response = customerinput.nextLine();
                if (response.equalsIgnoreCase("yes")){
                    System.out.println("Thank you for using Bildup Banking App");
                    return;
                }
                else {
                    break;
                }
                default:
                System.out.println("You entered an invalid number");
            }
            System.out.println("WHAT OPERATION DO YOU WANT?\n1. Customer Onboarding\n2. Account Opening\n3. Deposit to Account\n4. Withdrawal from Account\n5. Transfer to other Accounts\n6. Account Closing\n7. View all Transactions\n8. Exit");
            option= customerinput.nextInt();
            customerinput.nextLine();
        }
        customerinput.close();
    }
}