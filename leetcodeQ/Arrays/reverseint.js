let x = -123;

let reversenum=0;

while(x != 0){
    let digit = x%10;
    x = Math.floor(x/10);
    reversenum = reversenum*10+digit;
}
console.log(reversenum);