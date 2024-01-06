import java.util.Scanner;
public class BigNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 5 number between 1 - 10:");
        int num[] = new int[5];
        int bigNum = 1;
        for(int i = 0; i < 5; i++){
            num[i] = scanner.nextInt();
            if(num[i] > bigNum){
                bigNum = num[i];
            }
        }
        System.out.println(bigNum);
    }
}
