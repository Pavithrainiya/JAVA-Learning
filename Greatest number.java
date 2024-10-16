
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare and initialize the variables
        int a = 10, b = 15, c = 20;
        
        // Find the maximum number using nested ternary operators
        int maximum = (a > b)? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Print the maximum number
        System.out.println("The maximum number is: " + maximum);
        }
}

OUTPUT:
java -cp /tmp/xA3UJ5YmmL/Main
The maximum number is: 20

=== Code Execution Successful ===