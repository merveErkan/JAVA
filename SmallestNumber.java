import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 10 number between 1 - 10:");
        int [] number = new int[10];
        for(int i = 0;  i < 10; i++){
            number[i] = scanner.nextInt();
        }
        int smalNum = number[0];
        int counter = 1;
        for(int i = 1; i < 10; i++){
            if(number[i] < number[0]){
                smalNum = number[i];
                counter = i + 1;
            }
        }
        System.out.println(counter);

    }
}
