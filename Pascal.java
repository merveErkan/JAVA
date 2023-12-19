import java.util.Scanner;

public class Star7 {
    public static void main(String[] args){
        for(int i = 0; i <= 5; i++){
            for(int space = 1; space <= 5 - i; space++){
                System.out.print("  ");
            }
            int number = 1;
            for(int j = 0; j <= i; j++){
                if(i == 0 || j == 0)
                    number = 1;
                else
                    number = number * (i - j + 1) / j;
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}
