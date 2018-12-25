
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int l = 0, r = 100;
        int num = random.nextInt(r+1);
        int input = 101;
        System.out.println("Guess number between " + l + " and " + r);
        do {
            try {
                Scanner scan = new Scanner(System.in);
                input = Integer.parseInt(scan.nextLine());
                if (input < l || input > r)
                    System.out.println("\nGuess number between " + l + " and " + r);
                else if (input < num) {
                    if (input >= l)
                        l = input + 1;
                    System.out.println("\nTry a bigger number between " + l + " and " + r);
                } else if (input > num) {
                    if (input <= r)
                        r = input - 1;
                    System.out.println("\nTry a smaller number between " + l + " and " + r);
                }
            }
            catch (Exception e){
                System.out.println("Error. Try again");
            }
           } while (input != num);
        System.out.println("\nYou won!!!");
    }
}