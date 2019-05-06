var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");
var size = lines.length;

var seq = [0, 1];
var result = 0;
while (size-- > 0) {
  let n = parseInt(lines.shift());

  for (let i = 2; i < n; i++) {
    if (i % 2 == 0) result = seq[0] + seq[1];
    else result = seq[0] * seq[1];
    seq[0] = seq[1];
    seq[1] = result;
  }
  if (n == 1) result = 0;
  if (n == 2) result = 1;
  console.log(result);
  result = 0;
  seq[0] = 0;
  seq[1] = 1;
}
