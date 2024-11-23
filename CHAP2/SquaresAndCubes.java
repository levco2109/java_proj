//  (Table of Squares and Cubes) Using only the programming techniques you learned in this 
//  chapter, write an application JAVA that calculates the squares and cubes of the numbers from 0 to 10 and 
//  prints the resulting values in table format, as shown below. 
//  number square cube 
public class SquaresAndCubes {
    public static void main(String[] args) {

        System.out.printf("%-6s %-6s %-6s%n", "Number", "Square", "Cube");
        
        for (int i = 0; i <= 10; i++) {
            int square = i * i; 
            int cube = i * i * i; 
            
            System.out.printf("%-6d %-6d %-6d%n", i, square, cube);
        }
    }
}
