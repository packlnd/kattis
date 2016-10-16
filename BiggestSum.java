public class BiggestSum {
  public static void main(String[] args) {
    System.out.println(biggestSum(new int[]{2, -8, 3, -2, 4, -10}));
    System.out.println(biggestSum(new int[]{-1, -2, -3, -4, -5}));
    System.out.println(biggestSum(new int[]{5, 2, 3, 4, 5}));
  }

  private static int biggestSum(int[] V) {
    int maxSum = Integer.MIN_VALUE;
    int maxSoFar = 0;
    for (int e : V) {
      maxSoFar = Math.max(maxSoFar+e, e);
      maxSum = Math.max(maxSum, maxSoFar);
    }
    return maxSum;
  }
}
