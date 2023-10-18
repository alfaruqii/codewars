// If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2, reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks and return the result as a string.

// If

//     sz is <= 0 or if str is empty return ""
//     sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

// Examples:

// revrot("123456987654", 6) --> "234561876549"
// revrot("123456987653", 6) --> "234561356789"
// revrot("66443875", 4) --> "44668753"
// revrot("66443875", 8) --> "64438756"
// revrot("664438769", 8) --> "67834466"
// revrot("123456779", 8) --> "23456771"
// revrot("", 8) --> ""
// revrot("123456779", 0) --> "" 
// revrot("563000655734469485", 4) --> "0365065073456944"

// Example of a string rotated to the left by one position:
// s = "123456" gives "234561".


function revrot(str, sz) {
  if(sz <= 0 || str == "" || sz > str.length) return "";
  let chunksize = str.length / sz;
  let data = [];
  let arrofchunk;
  for(let i=0;i<chunksize;i++){
    arrofchunk = str.substring(sz*i,sz*(i+1));
    data.push(arrofchunk);
  }
  if(data[data.length-1].length != sz){
    data.pop();
  }
  for(let j=0;j<data.length;j++){
    let temptotal = 0;
    for(let k=0;k<data[j].length;k++){
      temptotal += parseint(data[j][k]);
    }
    if(temptotal % 2 === 0){
      data[j] = data[j].split("").reverse().join("");
    }else{
      let temp = data[j][0];
      data[j] = data[j].slice(1);
      data[j] += temp;
    }
  }
  return data.join("");
}
