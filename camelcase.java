import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int wordCount = 1;
        for (int i=1; i<s.length(); ++i) {
            if (Character.isUpperCase(s.charAt(i)))
                ++wordCount;
        }
        System.out.println(wordCount);
    }
}
