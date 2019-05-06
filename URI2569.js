var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [a, op, b] = lines
  .shift()
  .split(" ")
  .map(e => {
    if (isNaN(e)) return e;
    return parseInt(
      e
        .split("")
        .map(e => (e == "7" ? 0 : e))
        .join("")
    );
  });
let result = op == "+" ? a + b : a * b;
console.log(
  parseInt(
    `${result}`
      .split("")
      .map(e => (e == "7" ? "0" : e))
      .join("")
  )
);
