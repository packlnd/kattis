import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] ar = new int[n];
        for (int i=0; i<n; ++i) {
            int e = in.nextInt();
            ar[i] = e;
        }
        for (int i=d; i<n; ++i) {
            System.out.print(ar[i]);
            System.out.print(" ");
        }
        for (int i=0; i<d; ++i) {
            System.out.print(ar[i]);
            System.out.print(" ");
        }
    }
}
