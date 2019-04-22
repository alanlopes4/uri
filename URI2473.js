var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var aposta = lines.shift().split(" ");
var sorteio = lines.shift().split(" ");

const result = aposta.filter(item => {
  return sorteio.includes(item);
}).length;

if (result === 3) console.log("terno");
else if (result === 4) console.log("quadra");
else if (result === 5) console.log("quina");
else if (result === 6) console.log("sena");
else console.log("azar");
