
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Input your string");

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String output="";
        for (int i =  string.length() -1 ;i >= 0; i--) {
            output += string.charAt(i);
        }

        System.out.println(output);
    }
}
