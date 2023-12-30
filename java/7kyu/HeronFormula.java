import java.lang.Math;

public class Kata {
  public static double heron(double a, double b, double c)
  {
    //code here
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
}
