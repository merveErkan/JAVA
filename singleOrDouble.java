import java.util.Random;

public class SingleOrDouble {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int[] doubleN = new int[100];
        int[] singleN = new int[100];
        int doubleCounter = 0, singleCounter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            if (array[i] % 2 == 0)
                doubleN[doubleCounter++] = array[i];
            else
                singleN[singleCounter++] = array[i];
        }

        System.out.println("Double Numbers\tSingle Numbers");

        for (int i = 0; i < (doubleCounter + singleCounter); i++) {
            if (i < doubleCounter && doubleN[i] != 0) {
                System.out.printf("\t%4d\t\t\t", doubleN[i]);
            }
            else {
                System.out.print(" \t\t\t\t\t");
            }
            if (i < singleCounter && singleN[i] != 0) {
                System.out.printf("%4d\n", singleN[i]);
            }
            else {
                System.out.println();
            }
        }
    }
}
