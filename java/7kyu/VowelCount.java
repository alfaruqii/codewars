// Description:

// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.


public class Vowels {

  public static int getCount(String str) {
    if(str.length()==0) return 0;
    int res = 0;
    String[] arrOfChar = str.split("");
    for(String word : arrOfChar){
      if("aeiou".indexOf(word) != -1){
        res+=1;
      }
    }
    return res;
  }

}


