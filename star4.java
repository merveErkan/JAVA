import java.util.Scanner;
public class Star4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row:");
        int row = sc.nextInt();
        for(int i = 0; i < row; i++){
            for(int j  = 0; j < row; j++){
                if(i == j || i + j == row - 1)
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.println();
        }
    }
}
