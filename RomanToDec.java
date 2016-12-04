import java.util.*;

public class RomanToDec {
  public static void main(String[] args) {
    System.out.println(toDec("III") == 3); 
    System.out.println(toDec("XVII") == 17); 
    System.out.println(toDec("XLI") == 41); 
    System.out.println(toDec("LXXXVII") == 87); 
  }

  private static int toDec(String roman) {
    if (roman.equals("")) return 0;
    if (roman.startsWith("M")) return 1000 + toDec(roman.substring(1));
    if (roman.startsWith("CM")) return 900 + toDec(roman.substring(2));
    if (roman.startsWith("D")) return 500 + toDec(roman.substring(1));
    if (roman.startsWith("CD")) return 400 + toDec(roman.substring(2));
    if (roman.startsWith("C")) return 100 + toDec(roman.substring(1));
    if (roman.startsWith("XC")) return 90 + toDec(roman.substring(2));
    if (roman.startsWith("L")) return 50 + toDec(roman.substring(1));
    if (roman.startsWith("XL")) return 40 + toDec(roman.substring(2));
    if (roman.startsWith("X")) return 10 + toDec(roman.substring(1));
    if (roman.startsWith("IX")) return 9 + toDec(roman.substring(2));
    if (roman.startsWith("V")) return 5 + toDec(roman.substring(1));
    if (roman.startsWith("IV")) return 4 + toDec(roman.substring(2));
    if (roman.startsWith("I")) return 1 + toDec(roman.substring(1));
    return -1;
  }
}
