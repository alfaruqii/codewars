// Description:

// Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)

// Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.
// Examples

//  123 ->  321
// -456 -> -654
// 1000 ->    1


public class ReverseNumber {

	public static int reverse(int number) {
    char[] tempChar = Integer.toString(number).toCharArray();
    String tempRes = "";
    for(int i=tempChar.length-1;i>=0;i--){
       tempRes += tempChar[i];
     }
    if(number < 0 && tempRes.length() != 2){
      tempRes = (tempRes.charAt(tempRes.length()-1)+""+tempRes.charAt(0)+tempRes.substring(1,tempRes.length()-1));
    }
    return Integer.parseInt(tempRes);
	}

}
