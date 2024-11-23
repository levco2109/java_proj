import java.util.Scanner; 

public class LargestSmallestIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number;
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE; 


        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt(); 

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);

        input.close();
    } 
} 
