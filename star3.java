import java.util.Scanner;
public class star2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter n:");
        System.out.println();
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
           for(int j = 1; j <= i; j++){
               System.out.printf("* ");
           }
           for(int k = 1; k <= (2 * (n - i)); k++){
               System.out.printf("  ");
           }
           for(int j = 1; j <= i; j++){
               System.out.printf("* ");
           }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.printf("* ");
            }
            for(int k = (2 * (n - i)); k >= 1; k--){
                System.out.printf("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
