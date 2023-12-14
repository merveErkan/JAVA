import java.util.Scanner;
public class star6 {
    public static void main(String[] args){
        for(int i = 1; i <= 6; i++){
            for(int j = i; j < 6; j++){ 
                System.out.printf("  ");
            }
            if(i == 1 || i == 6){
                for(int k = 1; k <= 2 * i - 1; k++){
                    System.out.printf("* ");
                }
            }
            else{
                System.out.printf("* ");
                for(int k = 1; k <= 2 * i - 3; k++){
                    System.out.printf("  ");
                }
                System.out.printf("* ");
            }

            System.out.println();
        }
    }
}
