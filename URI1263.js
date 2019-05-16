var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

lines.map(phrase => {
  console.log(
    phrase.split(" ").reduce((acc, word, idx, words) => {
      let proxWord = words[idx + 1].charAt(0).toLowerCase();
      if (proxWord != undefined && word.charAt(0).toLowerCase() == proxWord)
        return acc++;
      return acc;
    }, 0)
  );
});
