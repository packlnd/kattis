import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int N = in.nextInt();
        BigInteger t1 = BigInteger.valueOf(n1);
        BigInteger t2 = BigInteger.valueOf(n2);
        System.out.println(recur(t1, t2, 3, N).toString());
    }
    
    public static BigInteger recur(BigInteger tim2, BigInteger tim1, int i, int n) {
        if (i > n) return tim1;
        return recur(tim1, tim2.add(tim1.multiply(tim1)), i+1, n);
    }
}
