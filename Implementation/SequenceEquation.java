import java.util.*;
import java.io.*;

/**
 * Created by rajat goyal on 3/19/2017.
 */

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p[] = new int[n];
        for(int i=0;i<n;i++) {
            p[i] = in.nextInt();
        }
        for(int i=1;i<=n;i++) {
            int j=0;
            int k=0;
            for(;j<n;j++) {
                if(p[j]==i)
                    break;
            }
            for(;k<n;k++) {
                if(p[k]==j+1)
                    break;
            }
            System.out.println(k+1);
        }
    }
}
