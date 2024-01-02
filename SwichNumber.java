import java.util.Scanner;
public class SwichNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        System.out.println();
        int sum1 = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp % 10;
            sum1 += digit;
            temp /= 10;
        }
        System.out.println(sum1);

        int flag = 0;
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                flag = 1;
        }
        if(flag == 1){
            System.out.print("prime factors:");
            for(int i = 2; i <= number; i++){
                while(number % i == 0){
                    System.out.print(i + " ");
                    sum += i;
                    number /= i;
                }
            }
            System.out.println();
            System.out.print(sum);
            System.out.println();
        }
        if(sum1 == sum)
            System.out.println("this number is swith number:");
        else
            System.out.println("this number is not swith number:");
    }
}
