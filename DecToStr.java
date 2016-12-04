import java.util.*;

public class DecToStr {
  public static void main(String[] args) {
    System.out.println(decToStr(100));
    System.out.println(decToStr(1060));
    System.out.println(decToStr(1061));
    System.out.println(decToStr(1017));
    System.out.println(decToStr(532));
  }

  private static String decToStr(int n) {
    StringBuilder sb = new StringBuilder();
    if (n == 0) return "Zero";
    if (n < 0) {
      n = -n;
      sb.append("Negative");
    }
    decToStr(n, sb);
    return sb.toString().trim();
  }

  static String[] nums = new String[]{
    " One",
    " Two",
    " Three",
    " Four",
    " Five",
    " Six",
    " Seven",
    " Eight",
    " Nine",
    " Ten"
  };

  static String[] tens = new String[]{
    " Twenty",
    " Thirty",
    " Forty",
    " Fifty",
    " Sixty",
    " Seventy",
    " Eighty",
    " Ninety"
  };

  static Map<Integer, String> map;
  static {
    map = new HashMap<Integer, String>();
    map.put(11, " Eleven");
    map.put(12, " Twelve");
    map.put(13, " Thirteen");
    map.put(14, " Fourteen");
    map.put(15, " Fifteen");
    map.put(16, " Sixteen");
    map.put(17, " Seventeen");
    map.put(18, " Eighteen");
    map.put(19, " Nineteen");
  }

  private static void decToStr(int n, StringBuilder sb) {
    if (n == 0) {
      return;
    } else if (n >= 1000) {
      sb.append(nums[(n/1000)-1]).append(" Thousand");
      decToStr(n%1000, sb);
    } else if (n >= 100) {
      sb.append(nums[(n/100)-1]).append(" Hundred");
      decToStr(n%100, sb);
    } else if (n >= 20) {
      sb.append(tens[(n/10)-2]);
      decToStr(n%10, sb);
    } else if (n <= 10) {
      sb.append(nums[n-1]);
    } else if (n < 20) {
      sb.append(map.get(n));
    }
  }
}
