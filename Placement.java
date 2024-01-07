import java.util.Scanner;
public class Placement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int N = scanner.nextInt();
        int first[] = new int[N];
        int second[] = new int [N];
        int counter = 0;
        for(int i = 0;  i < N; i++){
            if(i % 2 == 0){
                first[i] = second[i - counter] ;
                second[i - counter] = scanner.nextInt();
                counter++;
            }
            else{
                first[i] = second[N - counter];
                second[N - counter] = scanner.nextInt();
            }


        }
        for(int i = 0; i < N; i++){
            System.out.print(second[i] + " ");
        }

    }
}
