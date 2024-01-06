import java.util.Scanner;
public class Word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = scanner.nextLine();
        char[] words = new char[30];
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            words[i] = word.charAt(i);
            counter++;
        }
        System.out.print(counter);
    }
}
