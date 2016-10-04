import java.util.*;

public class BalancedBrackets {

  private static boolean isOpenBracket(char c) {
    return c == '{' || c == '[' || c == '(';
  }

  private static boolean isMatching(char c1, char c2) {
    return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
  }

  public static void main(String[] args) {
    int a = {1};
    double a = -10.0 / 0;
    System.out.println(a);
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    for (int t=0; t<n; ++t) {
      String s = in.nextLine();
      Stack<Character> stack = new Stack<Character>();
      for (int i=0; i<s.length(); ++i) {
        if (isOpenBracket(s.charAt(i))) {
          stack.push(s.charAt(i));
          if (i==s.length()-1)
            System.out.println("NO");
          continue;
        }
        if (stack.isEmpty()) {
          System.out.println("NO");
          break;
        }
        char c = stack.pop();
        if (!isMatching(c, s.charAt(i))) {
          System.out.println("NO");
          break;
        }
        if (i==s.length()-1) {
          if (stack.isEmpty())
            System.out.println("YES");
          else
            System.out.println("NO");
        }
      }
    }
  }
}
