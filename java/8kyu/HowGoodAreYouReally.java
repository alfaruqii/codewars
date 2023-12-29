import java.util.stream.IntStream;
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    return (IntStream.of(classPoints).sum())/classPoints.length < yourPoints;
  }
}
