import java.util.Scanner; 
// (Arithmetic, Smallest and Largest) Write an application JAVA that inputs three integers from the 
// user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques 
// shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer 
// representation of the average. So, if the sum of the values is 7, the average should be 2, not 
// 2.3333….]

public class ArithmeticSmallestLargest {
   
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); 

        System.out.print("Enter third integer: ");
        number3 = input.nextInt(); 

        int sum = number1 + number2 + number3;

        int average = sum / 3;

        int product = number1 * number2 * number3;

        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    } 
}
