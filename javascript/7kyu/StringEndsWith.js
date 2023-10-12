// Description:

// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string). 

function solution(str, ending){
  let test = [];
  for(let i=1;i<=ending.length;i++){
    test.push(str[str.length-i]);
  }
  return test.reverse().join("") === ending;
}
