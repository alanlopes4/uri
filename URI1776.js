var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var t = lines.shift();
var quadrados = [];
for (let x = 1; x <= t; x++) {
  var value = parseInt(lines.shift());
  if (quadrados[value] == undefined) {
    for (let i = 1; i <= value; i++) {
      if (quadrados[i] != undefined) {
        if (quadrados[i] % value == 0) {
          console.log(`Caso ${x}: ${quadrados[i]}`);
          break;
        }
      } else {
        quadrados[i] = i * i;
        if (quadrados[i] % value == 0) {
          console.log(`Caso ${x}: ${quadrados[i]}`);
          break;
        }
      }
    }
  } else console.log(quadrados[value]);
}
