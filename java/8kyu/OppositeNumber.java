// Very simple, given an integer or a floating-point number, find its opposite.

// Examples:

// 1: -1
// 14: -14
// -34: 34

import java.lang.Math;
public class Kata
    {
        public static int opposite(int number)
        {
          if(number < 0){
            return Math.abs(number);
          }else if(number > 0){
            return number*-1;
          }
          return number;
        }
    }
