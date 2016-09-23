import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder ht = new StringBuilder();
        StringBuilder sp = new StringBuilder();
        for (int i=0; i<n; ++i) {
            sp.append(' ');
        }
        for (int i=1; i<=n; ++i) {
            ht.append('#');
            if (sp.length() != 0)
                sp.deleteCharAt(sp.length()-1);
            System.out.println(sp.toString() + ht.toString());
        }
    }
}

