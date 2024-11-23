 import java.util.Scanner;  

public class AccountTest1  
{  
    public static void main(String[] args)  
    {  
        Account account1 = new Account("Jane Green", 50.00);   
        Account account2 = new Account("John Blue", -7.53);    

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);  

        System.out.print("Enter deposit amount for account1: "); 
        double depositAmount = input.nextDouble();  
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);  
        account1.deposit(depositAmount);   

        // display balances  
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");  
        depositAmount = input.nextDouble(); 
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);  
        account2.deposit(depositAmount);  

 
        displayAccount(account1);
        displayAccount(account2);
        input.close();
    } 

    public static void displayAccount(Account accountToDisplay) 
    { 
        // Display accountToDisplay's name and balance
        System.out.printf("%s balance: $%.2f%n", 
                          accountToDisplay.getName(), 
                          accountToDisplay.getBalance()); 
    } 
}
