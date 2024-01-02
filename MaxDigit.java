import java.util.Scanner;
public class MaxDigit {
    public static void main(String[] arhs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        int maxDigit = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit > maxDigit){
                maxDigit = digit;
            }
            number /= 10;
        }
        System.out.println("maxDigit:" + maxDigit);
    }
}
