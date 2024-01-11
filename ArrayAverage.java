import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numberArray[i] = scanner.nextInt();
        }

        double average = 0;
        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }

        average = (double) sum / numberArray.length;

        if (average % 1 == 0) {
            int integerAverage = (int) average;

            int occurrenceCount = 0;
            for (int number : numberArray) {
                if (number == integerAverage) {
                    occurrenceCount++;
                }
            }

            System.out.println("The number " + integerAverage + " appears " + occurrenceCount + " times in the array.");
        } else {
            System.out.println("The array average is not an integer.");
        }
    }
}
