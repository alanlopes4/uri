var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var result = lines
  .shift()
  .split(" ")
  .reduce((acc, item, idx, array) => {
    item = parseInt(item);
    let proxItem = parseInt(array[idx + 1]);
    if (!isNaN(proxItem)) {
      if (item < proxItem && (acc == "C" || acc == "I")) return (acc = "C");
      else if (item > proxItem && (acc == "D" || acc == "I"))
        return (acc = "D");
      else return (acc = "N");
    }
    return acc;
  }, "I");
console.log(result);
