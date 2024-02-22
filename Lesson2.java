import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.printf(" ");
            }
            if(i != 0)
                System.out.printf("*");
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int j = i + 1; j <= 2 * n - i - 1; j++){
                System.out.printf(" ");
            }
            if(i != n)
                System.out.printf("*");
            System.out.println();
        }
    }
}
