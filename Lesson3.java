import java.util.Scanner;
public class Lesson3 {
    public static void main(String[] args){
        int row = 4;

        for(int i = 0; i < row; i++){
            for(int j = i; j <= row; j++){
                System.out.printf(" ");
            }
            System.out.printf("/");
            if(i != 0){
                for(int j = 0; j <= i; j++){
                    System.out.printf("*");
                    if(i != j)
                        System.out.printf(" ");
                }
            }
            else
                System.out.printf(" ");
            System.out.printf("\\");
            System.out.println();

        }
        for(int i = row ; i > 0; i--){
            for(int j = row + 1; j >= i; j--){
                System.out.printf(" ");
            }
            System.out.printf("\\");
            if(i != 1){
                for(int j =  1; j <= i; j++){
                    System.out.printf("*");
                    if(i != j)
                        System.out.printf(" ");
                }

                System.out.printf("/");
            }
            else
                System.out.printf(" /");
            System.out.println();
        }
    }
}
