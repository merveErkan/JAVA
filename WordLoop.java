import java.util.Scanner;

public class WordLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = scanner.nextLine();
        char[] words = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < words.length - 1; j++) {
                char temp = words[j];
                words[j] = words[j + 1];
                words[j + 1] = temp;
            }
            System.out.println(String.valueOf(words));
        }
    }
}
