import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Eksempel {

    public static void main(String[] args) throws FileNotFoundException {
        int[] a = new int[20];

        for (int i = 1; i <= 20; i++) {
            a[i-1] = i;
        }
        // for (int i = 0; i < 20; i++) {
        //     a[i] = i+1;
        // }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}