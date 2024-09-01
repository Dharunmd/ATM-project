import java.util.*;

public class ATMproject {
 public static void main(String[] args) {
    int pin = 1234;
    int balance = 10000;

    int addamount=0;
    int takeamount=0;
    
    String name;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your pin number");
    int password = scanner.nextInt();

    if(password==pin);
    System.out.println("Enter your name");
    name=scanner.next();
    System.out.println("Welcome"+name);

    
    

    while (true) {
        System.out.println("Press 1 to check your balance");
        System.out.println("Press 2 to add amount");
        System.out.println("Press 3 to take ammount");
        System.out.println("Press 4 to get recipt");
        System.out.println("exit");

        int opt = scanner.nextInt();
        switch (opt) {
            case 1:
            System.out.println("Your current balance is :"+balance);
            
            break;
        
            
                case 2:
                    System.out.println("How much amount did you want to take");
                 addamount=scanner.nextInt();
                 System.out.println("Sucessfully credited");
                 balance = addamount+balance;
                    break;
                    
                    case 3:
                 System.out.println("How much amount want to take");
                 takeamount=scanner.nextInt();
                 if(takeamount>balance){
                System.out.println("Your balance is insufficient");
                System.out.println("Try less than yot current balance");
                 }
                else {
                    System.out.println("sucessfully taken");
                    balance=balance-takeamount;
                }
                break;
                case 4: {
                    System.out.println("Welcome to MD bank's ATM" );
                    System.out.println("avalabile balance is:" + balance);
                    System.out.println("amount deposited is:" +addamount);
                    System.out.println("amount taken is:" + takeamount);
                    System.out.println("Thanks for comming");
                    break;
                }
                    default: {
                        System.out.println("Press the numbers below 5");
                        break;
                    }
                }
                if(opt==5){
                    System.out.println("Thank you");
                    break;
                }
                
                 else {
                    System.out.println("Entered pin is wrong");
                }
            }  
        }
    }   
