import java.util.Scanner; 

public class CircleProperties {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle (as a number): ");
        double radius = input.nextDouble(); 

        System.out.printf("Diameter: %.2f%n", 2 * radius);
        System.out.printf("Circumference: %.2f%n", 2 * Math.PI * radius); 
        System.out.printf("Area: %.2f%n", Math.PI * radius * radius); 

        input.close();
    }
} 
