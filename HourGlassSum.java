import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSum = -2000;
        for (int row=0;row<4; ++row) {
            for (int col=0; col<4; ++col) {
                int hourGlassSum = 
                    arr[row][col] +
                    arr[row][col+1] +
                    arr[row][col+2] +
                    arr[row+1][col+1] +
                    arr[row+2][col] +
                    arr[row+2][col+1] +
                    arr[row+2][col+2];
                maxSum =  Math.max(maxSum, hourGlassSum);
            }
        }
        System.out.println(maxSum);
    }
}
