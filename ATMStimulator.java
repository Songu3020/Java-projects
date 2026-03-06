import java.util.Scanner;

    public class ATMStimulator {

        public static void main(String[]args) {

        Scanner input = new Scanner (System.in);
        
        double balance = 1000;
        double deposit = 0;
        double withdraw = 0;
        int choice = 0;
 
        while(true){
             System.out.println("\nATM menu:");
             System.out.println("1. Deposit");
             System.out.println("2. Withdraw");
             System.out.println("3. Check Balance");
             System.out.println("4. Exit ");
             System.out.println("Enter your chioce: ");
             choice = input.nextInt();
                
             switch (choice){
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    deposit = input.nextDouble();
                     balance +=  deposit;
                    System.out.println("Deposited: $" + deposit+ " and ur balance is "+balance);
                   break; 

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = input.nextDouble();
                    if(withdraw > balance){
                    System.out.print("insufficient balance ");
                   } else {
 
                    System.out.println("Withdraw : $" + withdraw);
                    }
                break;
            
                case 3:
 
                     balance -= withdraw    ;
                    System.out.println("Current Balance: $" + balance);
                    
                break;
            
                case 4:
    
                    System.out.println("Exiting... Thank you! ");
                    break;
                    
                
                        }
                    }                    
                     }

                 }

            

        


