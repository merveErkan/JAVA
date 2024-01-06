import java.util.Scanner;
public class FibonnaciWithArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < 10; i++){
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        for(int i = 0; i < 10; i++){
            System.out.println(fib[i]);
        }
    }
}
