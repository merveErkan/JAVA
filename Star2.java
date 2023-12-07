import java.util.Scanner;
public class star3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N:");
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(i == 1 || i == N || j == 1 || j == N || i == j || j == N - i + 1)
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.println();
        }
    }
}
