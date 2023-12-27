import java.util.stream.IntStream;
import java.lang.Math;

public class Kata{
  public static double find_average(int[] array){
    if(array.length > 0){
      return (double)IntStream.of(array).sum()/array.length;
    }
    return 0;
  }
}
