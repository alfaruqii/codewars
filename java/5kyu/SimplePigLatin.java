// Description:

// Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
// Examples

// pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
// pigIt('Hello world !');     // elloHay orldway !



public class PigLatin {
    public static String pigIt(String str) {
      String[] data = str.split(" ");
      for(int i=0;i<data.length;i++){
        boolean allString = data[i].chars().allMatch(Character::isLetter);
        if(allString){
          String temp = data[i].substring(0,1);
          data[i] = data[i].substring(1,data[i].length())+temp+"ay";
        }
      }
      return String.join(" ",data);
    }
}
