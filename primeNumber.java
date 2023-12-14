import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            int prime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = 0;
                }
            }
            if(prime == 0) {
                System.out.print(i + " = ");
                int tempNumber = i;
                for (int num = 2; num <= tempNumber; num++) {
                    while (tempNumber % num == 0) {
                        System.out.printf("%d ", num);
                        tempNumber /= num;
                    }
                }
                System.out.println();
            }
        }
    }
}
