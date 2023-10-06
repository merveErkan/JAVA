import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        
        Scanner scanner = new java.util.Scanner(System.in);
        String[] students = new String[4];
        int[][] examNotes = new int[4][4];
        for(int i = 0; i < 4; i++){
            System.out.println("enter students name:");
            students[i] = scanner.nextLine();
            System.out.println("physics midterm exam note:");
            examNotes[i][0] = scanner.nextInt();
            System.out.println("physics fınal exam note:");
            examNotes[i][1] = scanner.nextInt();
            System.out.println("chemitry midterm exam note:");
            examNotes[i][2] = scanner.nextInt();
            System.out.println("chemitry fınal exam note:");
            examNotes[i][3] = scanner.nextInt();
            scanner.nextLine();
        }
        for(int i = 0; i < 4; i++){
            System.out.printf(students[i] + ":" +
            examNotes[i][0] + "," +
            examNotes[i][1] + "," +
            examNotes[i][2] + "," +
            examNotes[i][3] );
            double passingScore = ((examNotes[i][0] + examNotes[i][1]) * 0.4) +
                                  ((examNotes[i][2] + examNotes[i][3]) * 0.6);
            System.out.println("\tPS: " + passingScore);
        }
    }
}
