import java.util.Scanner;
public class star1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf( "enter n:");
        int n = scanner.nextInt();
        for(int i = n; i > 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.printf("  ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.printf("  ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
