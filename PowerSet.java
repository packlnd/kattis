import java.util.*;

public class PowerSet {
  static Set<Set<Integer>> findPowerSet(List <Integer> originalList) {
      int count = originalList.size();
      int subsetCount = 1 << count;

      Set<Set<Integer>> powerSet = new HashSet<Set<Integer>>();

      for (int i=0; i < subsetCount; i++) {
          Set<Integer> subset = new HashSet<Integer>();
          int j=i;
          for (int pos=0; pos<count; ++pos) {
              if ((j & 1) != 0)
                  subset.add(originalList.get(pos));
              j >>= 1;
          }
          powerSet.add(subset);
      }
      return powerSet;
  }

  public static void main(String[] args) {
      List<Integer> l = new ArrayList<Integer>();
      l.add(1);
      l.add(2);
      l.add(3);
      System.out.println(l);
      System.out.println(findPowerSet(l));
  }
}
