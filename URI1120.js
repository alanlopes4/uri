var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var tam = lines.length - 1;
var keep = false;
while (tam-- > 0) {
  [d, n] = lines.shift().split(" ");
  var num = n
    .split("")
    .map((value, idx, nums) => {
      if (value == d) return "";
      else if (value != 0) {
        keep = true;
        return value;
      } else if (keep) return value;
      return "";
    })
    .join("");
  console.log(num == 0 ? 0 : num);
  keep = false;
}
