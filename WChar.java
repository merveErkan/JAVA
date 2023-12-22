


package javaapplication1;

public class Star {
    public static void main(String[] args) {
      int n = 5, space = (2 * n) - 1, subStar = 6,temp = 0;
      for(int i = 0; i < n; i++){
          for(int j = 0; j < i; j++){
              System.out.printf(" ");
          }
          System.out.printf("XX");
          for(int j = 0; j < space; j++){
              System.out.printf(" ");
          }
          System.out.printf("XX");
          for(int j = 0; j < 2 * i; j++){
              System.out.printf(" ");
          }
          System.out.printf("XX");
          for(int j = 0; j < space; j++){
              System.out.printf(" ");
          }
          System.out.printf("XX");
          System.out.println("");
          space -=2;
          temp++;
      }
      while((subStar / 2) >= 1){
          subStar /= 2;
          for(int i = 0; i < temp; i++){
              System.out.printf(" ");
          }
          for(int j = 0; j  < subStar; j ++){
              System.out.printf("X");
          }
          for(int i = 0; i < 2 *  temp; i++){
              System.out.printf(" ");
          }
          for(int j = 0; j  < subStar; j ++){
              System.out.printf("X");
          }
          System.out.println("");
          temp++;
      }
      
    }
            
}
