import java.util.Scanner; 
//Write an application JAVA that asks the user to enter two integers, 
//obtains them from the user and displays the larger number followed by the words "is larger". 
//If the numbers are equal, print the message "These numbers are equal".
public class CompareTwoIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();


        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); 


        if (number1 > number2) {
            System.out.println(number1 + " is larger");
        } else if (number2 > number1) {
            System.out.println(number2 + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    } 
} 
