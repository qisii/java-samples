import java.util.*;
// sample
// input: 3
// output: 6
// Explanation: 1 x 2 x 3


public class Factorial {
    public static void main(String[] args) {
        System.out.println("This is a simple java factorial.");
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = s.nextInt();
        int result = 1;

        // using for loop
        // for(int i = 1; i <= num; i++) {
        //     result *= i;
        // }

        // using while loop
        int i = 1;
        while (i <= num) {
            result *= i;
            i++;
        }

        System.out.println("The result is: " + result);
    }
}
