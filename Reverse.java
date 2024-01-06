import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = scanner.nextLine();
        char[] words = word.toCharArray();

        for(int i = 0; i < words.length / 2; i++){
            char temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        String reverseWord = new String((words));
        System.out.println(reverseWord);
    }
}
