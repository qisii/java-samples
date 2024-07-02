import java.util.*;
// generate a random number
// input number
// while loop and if else conditions to find the number.

public class GuessingGame {
    public static void main(String[] args) {
        int tries = 0;
        boolean loop = false; 
        System.out.println("This is a Guessing Game.");
        do {
            int guessNumber = 43;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = s.nextInt();
            
            if(num > guessNumber) {
                System.out.println("Clue: Lower. Try again.");
                tries++;
                loop = false;
            }
            else if(num < guessNumber) {
                System.out.println("Clue: Higher. Try again.");
                tries++;
                loop = false;
            }
            else {
                System.out.println("=====YEHEY=====");
                System.out.println("You have guessed the number in " + tries + " tries!");
                System.out.println("The number is " + guessNumber);
                // System.out.println("Number of tries: " + tries);
                loop = true;
            }
        }while (loop == false);
    }
}