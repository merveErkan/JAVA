
import java.util.Scanner;

public class Overturn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter five word:");
        for(int i = 0; i < 5; i++){
            words[i] = scanner.nextLine();
        }
        for(int i = 0; i < 5; i++){
            int j = 0;
            StringBuilder reverse = new StringBuilder(words[i]);
            while(j < (reverse.length() / 2)){
                char temp = reverse.charAt(j);
                reverse.setCharAt(j, reverse.charAt(reverse.length() - 1 - j));
                reverse.setCharAt(reverse.length() - 1 - j, temp);
                j++;
            }
            words[i] = reverse.toString();
        }   
        for(int i = 0; i < 5; i++){
            System.out.printf("%s ", words[i]);
        }
                
    }  
    
}
