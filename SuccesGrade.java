import java.util.Scanner;

public class SuccesGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 50;
        int[] grade = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            grade[i] = (int) (Math.random() * 101);
        }

        int counter = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            if (grade[i] >= 50) {
                counter++;
            }
        }

        System.out.println("Number of students who passed the success grade: " + counter);
    }
}
