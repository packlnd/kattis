public class TempTracker {

  private int min = Integer.MAX_VALUE;
  private int max = Integer.MIN_VALUE;
  private int tempsSeenSoFar = 0;
  private long sumTempsSeenSoFar = 0;
  private float mean;
  private int[] timesSeen = new int[111];
  private int modeTemp=0;

  public void insert(int temp) {
    min = Math.min(temp, min);
    max = Math.max(temp, max);
    ++tempsSeenSoFar;
    sumTempsSeenSoFar += temp;
    mean = (float)tempsSeenSoFar/sumTempsSeenSoFar;
    ++timesSeen[temp];
    if (temp == modeTemp)
      return;
    for(int i=0; i<111; ++i) {
      modeTemp = Math.max(timesSeen[temp], timesSeen[modeTemp]);
    }
  }

  public int getMin() {
    return min;
  }

  public int getMax() {
    return max;
  }

  public int getMode() {
    return modeTemp;
  }

  public float getMean() {
    return mean;
  }
}
