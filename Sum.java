import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int result = 0;
        

        // using for loop
        // for(int i = 0; i <= num; i++) {
        //     result += i;
        // }

        // using while loop
        int i = 0;
        while (i <= num) {
            result += i;
            i++;
        }

        System.out.println("The result is: " + result);
    }
}
