import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        for (int i=0; i<first.length(); ++i)
            ++freq[first.charAt(i)-'a'];
        for (int i=0; i<second.length(); ++i)
            --freq[second.charAt(i)-'a'];
        int count = 0;
        for (int e : freq)
            count += Math.abs(e);
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

