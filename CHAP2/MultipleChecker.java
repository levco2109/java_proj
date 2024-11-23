import java.util.Scanner; 
// (Multiples) Write an application JAVA that reads two integers, determines whether the first is a 
// multiple of the second and prints the result. [Hint: Use the remainder operator.]
public class MultipleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt(); 

        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt(); 

        if (secondNumber == 0) {
            System.out.println("The second number cannot be zero.");
        } else {
            if (firstNumber % secondNumber == 0) {
                System.out.println(firstNumber + " is a multiple of " + secondNumber + ".");
            } else {
                System.out.println(firstNumber + " is not a multiple of " + secondNumber + ".");
            }
        }

        input.close();
    } 
} 
