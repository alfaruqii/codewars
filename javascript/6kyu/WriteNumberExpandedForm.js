// Description:
// Write Number in Expanded Form

// You will be given a number and you will need to return it as a string in Expanded Form. For example:

// expandedForm(12); // Should return '10 + 2'
// expandedForm(42); // Should return '40 + 2'
// expandedForm(70304); // Should return '70000 + 300 + 4'

// NOTE: All numbers will be whole numbers greater than 0.

// If you liked this kata, check out part 2!!


function expandedForm(num) {
  const arrOfInt = num.toString().split("").reverse();
  let res = "";
  const tempRes = arrOfInt.map((item,index) => {
    if(item !== '0'){
      item+="0".repeat(index);
      return item;
    }else if(item === '0') return;
    return item;
  })
  const lastRes = tempRes.filter((item,index) => {
    return item !== "0" && item !== undefined;
  }).reverse();
  lastRes.forEach((item,index) => {
    if(index === lastRes.length-1){
      res+=item;
      return;
    }
    if(item !== undefined)
      res+=item+" + ";
  })
  return res;
}
