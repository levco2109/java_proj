import java.util.Scanner; 
//  (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, 
//  separates the number into its individual digits and prints the digits
//  separated from one another by three spaces each.
public class SeparateDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt(); 

        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter a valid five-digit number.");
        } else {
  
            int fifthDigit = number % 10; 
            number /= 10;

            int fourthDigit = number % 10; 
            number /= 10; 

            int thirdDigit = number % 10; 
            number /= 10;

            int secondDigit = number % 10;
            number /= 10; 

            int firstDigit = number % 10; 

            System.out.printf("%d   %d   %d   %d   %d%n", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
        }

        input.close();
    } 
} 
