var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [f, r] = lines.shift().split(" ");
var [...gotas] = lines
  .shift()
  .trim()
  .split(" ");
var dist = gotas.map((e, idx) => {
  if (idx == 0) return e - 1;
  return e - gotas[idx - 1] - 1;
});
let last = f - gotas[gotas.length - 1];
dist.push(last);
var count = 0;
while (dist.some(e => e > 0)) {
  dist = dist.map((e, idx) => {
    if (e == 0) return e;
    if (idx == 0) return e - 1;
    if (idx == dist.length - 1) return e - 1;
    return e - 2;
  });
  count++;
}
console.log(count);
