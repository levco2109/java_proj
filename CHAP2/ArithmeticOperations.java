import java.util.Scanner; 
//Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division). Use the techniques
//shown in Fig. 2.7.
public class ArithmeticOperations 
{ 
    public static void main(String[] args) 
    { 
        // create a Scanner to obtain input from the command window 
        Scanner input = new Scanner(System.in); 
        int number1;  
        int number2; 
        int sum; 
        int product;
        int difference; 
        double quotient; 

        System.out.print("Enter first integer: "); 
        number1 = input.nextInt(); 

        System.out.print("Enter second integer: ");  
        number2 = input.nextInt(); 

        sum = number1 + number2; 
        product = number1 * number2; 
        difference = number1 - number2; 

        // check for division by zero
        if (number2 != 0) {
            quotient = (double) number1 / number2; 
            System.out.printf("Quotient is %.2f%n", quotient); 
        } else {
            System.out.println("Cannot divide by zero."); 
        }

        System.out.printf("Sum is %d%n", sum); 
        System.out.printf("Product is %d%n", product); 
        System.out.printf("Difference is %d%n", difference); 

        input.close(); 
    } // end method main 
}
