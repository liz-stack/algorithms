# algorithms
백준 알고리즘 단계별 문제풀이(javascript)

## 1. 하나의 값을 입력받을 때
const input = require('fs').readFileSync('/dev/stdin').toString().trim();

## 2. 공백으로 구분된 한 줄의 값들을 입력받을 때
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ');

## 3. 여러 줄의 값들을 입력받을 때
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\r\n');

## 4. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄에 공백으로 구분된 n개의 값들을 입력받을 때
const [n, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split(/\s/);

## 5. 첫 번째 줄에 자연수 n을 입력받고, 그 다음줄부터 n개의 줄에 걸쳐 한 줄에 하나의 값을 입력받을 때
const [n, ...arr] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\r\n');

## 6. 하나의 값 또는 공백으로 구분된 여러 값들을 여러 줄에 걸쳐 뒤죽박죽 섞여서 입력받을 때

ex) n 입력 - 공백으로 구분된 n개의 값 입력 - m 입력 - 여러 줄에 걸쳐 m개의 값 입력
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(/\s/);
const n = input[0];
const n_arr = input.slice(1, n+1);
const [m, ...m_arr] = input.slice(n+1);


## readLine 모듈 사용해야 하는 경우
### 예제 입력이 한줄로 되어 있을 때
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', function(line) {
  console.log(line);

  rl.close();
}).on("close", function() {
  process.exit();
});

-----------------------------------------

### 예제 입력이 여러줄로 되어 있을 떼
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', function (line) {
  input.push(line)
})
  .on('close', function () {
  console.log(input);
  process.exit();
});

출처: https://hanch-dev.tistory.com/4 [HanCh_Dev:티스토리]


### 참고
https://help.acmicpc.net/language/info (백준공식)
https://tesseractjh.tistory.com/39
