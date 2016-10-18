import java.util.Scanner;

public class StringTask {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine().toLowerCase();
    StringBuilder sb = new StringBuilder();
    String vowels = "youiea";
    for (int i=0; i<s.length(); ++i) {
      if (vowels.indexOf(s.charAt(i))>=0) {
        continue;
      }
      sb.append("." + s.charAt(i));
    }
    System.out.println(sb.toString());
  }
}
