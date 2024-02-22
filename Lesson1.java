import java.util.Scanner;
public class lesson1 {
    public static void main(String[] args){
        int row = 5;
        for(int i = 0; i < row; i++){
            for(int j = i; j <= row; j++){
                System.out.printf(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("* ");
            }
            System.out.println();

        }
        for(int i = row - 1; i >= 1; i--){
            for(int j = row + 1; j >= i; j--){
                System.out.printf(" ");
            }
            for(int j =  1; j <= i; j++){
                System.out.printf("* ");
            }
            System.out.println();
        }

    }
}
