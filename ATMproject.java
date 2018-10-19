
import java.util.Scanner;

public class ATMproject
{
	static int balance = 10000;
	static int withdraw;
	static int deposit;
    static Scanner s = new Scanner(System.in);
    static String AN = "135", P, A;
    public static void main(String args[] )
    { 
    	System.out.println("Welcome to Java ATM");
    	AccountPin(AN, P);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
    public static String AccountPin(String AN, String P){
    	String A = "invalid";
    	while (A == "invalid"){
    		System.out.println("Please enter you account pin");
        	P = s.nextLine();
    		
    			if(AN.equals("135")&&(P.equals("123"))){
    				A = "Joshua B";
    			}
    			if (A.equals("invalid")){
    			System.out.println("incorrect pin, please enter again.");
    			}
    			else
    				System.out.println("Hello Joshua");
    		}
				
    	return A;}}
    
	
