import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String[] A = new String[N];
        for (int i=0; i<N; ++i) {
            A[i] = in.nextLine();
        }
        int Q = Integer.parseInt(in.nextLine());
        String[] B = new String[Q];
        for (int i=0; i<Q; ++i) {
            B[i] = in.nextLine();
        }
        for (String s1 : B) {
            int count = 0;
            for (String s2 : A) {
                if (s2.equals(s1)) {
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
