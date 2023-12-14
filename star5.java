import java.util.Scanner;
public class Star5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the row:");
        int row = scanner.nextInt();
        for(int i = 0; i <= row; i++){
            for(int j = row; j >= i; j--){
                System.out.printf("* ");
            }
            for(int k = 0; k <= (2 * i) - 1; k++){
                System.out.printf("  ");
            }
            for(int j = row; j >= i; j--){
                System.out.printf("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= row; i++){
            for( int j = 0; j <= i; j++){
                System.out.printf("* ");
            }
            for(int k = 1; k <= 2 * (row - i); k++){
                System.out.printf("  ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
