//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

let fs = require('fs');

const input = require('fs').readFileSync('./step1/input.txt').toString().trim().split('\r\n');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
console.log(a - b);

