// Description:
// Is the string uppercase?
// Task

// Create a method to see whether the string is ALL CAPS.
// Examples (input -> output)

// "c" -> False
// "C" -> True
// "hello I AM DONALD" -> False
// "HELLO I AM DONALD" -> True
// "ACSKLDFJSgSKLDFJSKLDFJ" -> False
// "ACSKLDFJSGSKLDFJSKLDFJ" -> True

// In this Kata, a string is said to be in ALL CAPS whenever it does not contain any lowercase letter so any string containing no letters at all is trivially considered to be in ALL CAPS.

export function isUpperCase(str: string) {
  let i = 0;
  if (str.length === 0) {
    return false;
  }
  let resBool = false;
  while (i < str.length) {
    if (str[i] !== str[i].toUpperCase()) {
      return false;
    } else {
      resBool = true;
    }
    i++;
  }
  return resBool;
}
