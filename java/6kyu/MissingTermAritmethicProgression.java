// Description:

// An Arithmetic Progression is defined as one in which there is a constant difference between the consecutive terms of a given series of numbers. You are provided with consecutive elements of an Arithmetic Progression. There is however one hitch: exactly one term from the original series is missing from the set of numbers which have been given to you. The rest of the given series is the same as the original AP. Find the missing term.

// You have to write a function that receives a list, list size will always be at least 3 numbers. The missing term will never be the first or last one.
// Example

// findMissing([1, 3, 5, 9, 11]) == 7

// PS: This is a sample question of the facebook engineer challenge on interviewstreet. I found it quite fun to solve on paper using math, derive the algo that way. Have fun!


import java.util.*;
import java.util.stream.IntStream;

public class Solution 
{
	public static int findMissing(int[] numbers)
	{
    if(numbers.length >= 3){
      Arrays.sort(numbers);
      int b1 = 0;
      int b2 = 0;
      if(numbers[0]>numbers[1]){
        b1 += numbers[0]-numbers[1];
        b2 += numbers[2]-numbers[1];
      }else if(numbers[0]<numbers[1]){
        b1 += numbers[1]-numbers[0];
        b2 += numbers[2]-numbers[1];
      }
      int realB = 0;
      if(b1 > b2){
        if(b2 > 0)
          realB += b2;
        else if(b2 < 0)
          realB -= b2;
      }else{
        if(b1 > 0)
          realB += b1;
        else if(b1 < 0)
          realB -= b1;
      }
      System.out.println("realB :"+realB);
      int realLength = numbers.length+1;
      int tempBef = 0;
      int sn = 0;
      if(numbers[0] == numbers[numbers.length-1])
        return numbers[0];
      if(numbers[0] < 0 && numbers[numbers.length-1] < 0){
        if(numbers[0] > numbers[numbers.length-1])
          sn=(realLength)*(2*numbers[0]+(realLength-1)*realB)/2;
        else
          sn=(realLength)*(2*numbers[0]+(realLength-1)*realB)/2;
      }else{
          sn=(realLength)*(2*numbers[0]+(realLength-1)*realB)/2;
      }
      for(int j=0;j<numbers.length;j++){
        tempBef += numbers[j];
      }
      System.out.println("tempBef :"+tempBef);
      System.out.println("sn :"+sn);
      return sn-tempBef;
    }
    return 0;
	}
}
