var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var msgDecodificada = lines
  .shift()
  .split("")
  .map((c, idx, msg) => {
    if (c == "p") {
      if (msg[idx + 1] == "p") {
        msg[idx + 1] = "";
        return "p";
      }
      return "";
    }
    return c;
  })
  .join("");

console.log(msgDecodificada);
