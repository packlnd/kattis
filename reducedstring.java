import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(in.nextLine());
        for (int i=0; i<sb.length()-1; ++i) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.delete(i, i+2);
                i=-1;
            }
        }
        if (sb.length() == 0) {
            System.out.println("Empty String");
            return;
        }
        System.out.println(sb.toString());
    }
}
