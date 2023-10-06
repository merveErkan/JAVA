
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "12345";
        System.out.println("Enter a password = ");
        String enterPass = scan.next();
        if(enterPass.equals(password))
            System.out.println("Correct");
        else
            System.out.println("Reject");


    }
}
