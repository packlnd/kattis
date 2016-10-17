import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(elementPresent(new int[]{2, -8, 3, -2, 4, -10}, 3));
    System.out.println(elementPresent(new int[]{-1, -2, -3, -4, -5}, 3));
    System.out.println(elementPresent(new int[]{5, 2, 3, 4, 5}, 7));
  }

  private static boolean elementPresent(int[] V, int e) {
    int l=0, r=V.length;
    Arrays.sort(V);
    while (l<r) {
      int mid = (l+(r-l)/2);
      if (V[mid] == e)
        return true;
      else if (e > V[mid])
        l=mid+1;
      else
        r=mid;
    }
    return false;
  }
}
