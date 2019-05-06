var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var risada = lines.shift().split("");

risada = risada
  .map(char => {
    if (char == "a" || char == "e" || char == "i" || char == "o" || char == "u")
      return char;
    return "";
  })
  .join("")
  .split("");

console.log(risada.join("") == risada.reverse().join("") ? "S" : "N");
