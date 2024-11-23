import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); 
        double depositAmount = input.nextDouble(); 
        System.out.printf("%nAdding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account’s balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); 
        depositAmount = input.nextDouble(); 
        System.out.printf("%nAdding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); 

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());


        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble(); 
        System.out.printf("%nWithdrawing from account1 balance%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount); 

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble(); 
        System.out.printf("%nWithdrawing from account2 balance%n%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
        input.close();
    }  
} 
