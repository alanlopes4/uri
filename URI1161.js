var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");
var size = lines.length;
for (let i = 0; i < size; i++) {
  var [m, n] = lines.shift().split(" ");

  console.log(calcFat(m) + calcFat(n));
}
function calcFat(x) {
  let total = x;
  if (total == 0 || total == 1) return 1;
  for (let i = 1; i < x; i++) total = total * (x - i);
  return total;
}
