
import java.util.Scanner;

public class MultiScroll {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] words = {"kalem", "silgi", "cetvel", "telefon", "bilgisayar"};

        for(int i = 0; i < words.length; i++){
            System.out.printf("%s  ", words[i]);
        }
        System.out.println(" ");

        String temp = words[0];
        for(int i = 0; i < words.length - 1; i++){
            words[i] = words[i + 1];
        }
        words[words.length - 1] = temp;


        for(int i = 0; i < words.length; i++){
            if(i % 2 == 0){
                StringBuilder first = new StringBuilder(words[i]);
                int  j = 0;
                while(j < (first.length() / 2)){
                    char tempChar  = first.charAt(j);
                    first.setCharAt(j, first.charAt(first.length() - 1 - j));
                    first.setCharAt(first.length() - 1 - j, tempChar);
                    j++;
                }
                words[i] = first.toString();
            }
            else{
                StringBuilder second = new StringBuilder(words[i]);
                char flag = second.charAt(0);
                for(int j = 0; j < (second.length() - 1); j++){
                    second.setCharAt(j, second.charAt(j + 1));
                }
                second.setCharAt(second.length() - 1, flag);
                words[i] = second.toString();
            }
        }

        for(int i = 0; i < words.length; i++){
            System.out.printf("%s ", words[i]);
        }
    }
}
