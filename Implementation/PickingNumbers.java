import java.util.*;
import java.io.*;

/**
 * Created by rajat goyal on 3/19/2017.
 */

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        pickNumbers(a, n);
    }

    public static void pickNumbers(int[] a, int n) {
        Arrays.sort(a);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1, count = 1;
            while(j < n && a[j] <= a[i] + 1){
                count++;
                j++;
            }
            if(count > max)
                max = count;
        }
        System.out.println(max);
    }
}
