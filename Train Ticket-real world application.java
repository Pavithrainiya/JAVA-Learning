
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n <= 72) {
            int c = n % 8;
            switch (c) {
                case 0:
                    System.out.println("Side Lower Berth ticket booked");
                    break;
                case 1:
                    System.out.println("Side Upper Berth ticket booked");
                    break;
                case 2:
                    System.out.println("Right Lower Berth ticket booked");
                    break;
                case 3:
                    System.out.println("Right Middle Berth ticket booked");
                    break;
                case 4:
                    System.out.println("Right Upper Berth ticket booked");
                    break;
                case 5:
                    System.out.println("Left Lower Berth ticket booked");
                    break;
                case 6:
                    System.out.println("Left Middle Berth ticket booked");
                    break;
                case 7:
                    System.out.println("Left Upper Berth ticket booked");
                    break;
                default:
                    System.out.println("Enter a valid seat number");
                    break;
            }
        } else {
            System.out.println("Enter a seat number less than or equal to 72");
        }

        in.close();
    }
}

OUTPUT:
java -cp /tmp/13K59qV8k6/program
89
Enter a seat number less than or equal to 72

=== Code Execution Successful ===