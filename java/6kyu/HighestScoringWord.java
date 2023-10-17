// Description:

// Given a string of words, you need to find the highest scoring word.

// Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

// For example, the score of abad is 8 (1 + 2 + 1 + 4).

// You need to return the highest scoring word as a string.

// If two words score the same, return the word that appears earliest in the original string.

// All letters will be lowercase and all inputs will be valid.


import java.util.Arrays;
public class Kata {

  public static String high(String s) {
    String[] arrOfStr = s.split(" ");
    int[] arrOfRes = new int[arrOfStr.length];
    for(int i=0;i<arrOfStr.length;i++){
      int res = 0;
      for(int j=0;j<arrOfStr[i].length();j++){
        switch (Character.toLowerCase(arrOfStr[i].charAt(j))){
            case 'a'->res+=1;
            case 'b'->res+=2;
            case 'c'->res+=3;
            case 'd'->res+=4;
            case 'e'->res+=5;
            case 'f'->res+=6;
            case 'g'->res+=7;
            case 'h'->res+=8;
            case 'i'->res+=9;
            case 'j'->res+=10;
            case 'k'->res+=11;
            case 'l'->res+=12;
            case 'm'->res+=13;
            case 'n'->res+=14;
            case 'o'->res+=15;
            case 'p'->res+=16;
            case 'q'->res+=17;
            case 'r'->res+=18;
            case 's'->res+=19;
            case 't'->res+=20;
            case 'u'->res+=21;
            case 'v'->res+=22;
            case 'w'->res+=23;
            case 'x'->res+=24;
            case 'y'->res+=25;
            case 'z'->res+=26;
        }
        arrOfRes[i] = res;
      }
    }
    int max = Arrays.stream(arrOfRes).max().getAsInt();
    for(int t=0;t<arrOfRes.length;t++){
      if(arrOfRes[t] == max){
        return arrOfStr[t];
      }
    }
    return "";
  }

}
