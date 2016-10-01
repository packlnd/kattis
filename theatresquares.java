import java.util.Scanner;

public class theatresquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m = (double)in.nextInt();
        double n = (double)in.nextInt();
        double a = (double)in.nextInt();
        long ceilm = (long)Math.ceil(m/a);
        long ceiln = (long)Math.ceil(n/a);
        System.out.println(ceilm*ceiln);
    }
}
