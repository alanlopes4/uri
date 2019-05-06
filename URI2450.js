var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [n, m] = lines.shift().split(" ");
var matrix = new Array();
for (let i = 0; i < n; i++) {
  matrix[i] = lines.shift().split(" ");
}
var tam = 0;
var comp = 0;
var escada = true;

if (n == 1)
  if (matrix[0].every(e => e == 0)) console.log("N");
  else console.log("S");
else {
  tam = matrix[0].findIndex(e => e != 0);

  if (tam == -1) {
    for (let i = 1; i < n; i++) {
      comp = matrix[i].findIndex(e => e != 0);
      if (comp == tam) tam = comp;
      else {
        escada = false;
        break;
      }
    }
  } else {
    for (let i = 1; i < n; i++) {
      comp = matrix[i].findIndex(e => e != 0);
      if (comp > tam) tam = comp;
      else if (comp != -1) {
        escada = false;
        break;
      }
    }
  }
}

console.log(escada ? "S" : "N");
