var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var size = lines.length;

var assassinos = new Map();
var assassinados = new Map();
for (let i = 0; i < size; i++) {
  let [assassino, assassinado] = lines.shift().split(" ");

  assassinos.set(
    assassino,
    assassinos.get(assassino) ? assassinos.get(assassino) + 1 : 1
  );

  assassinados.set(
    assassinado,
    assassinados.get(assassinado) ? assassinados.get(assassinado) + 1 : 1
  );
}

console.log("HALL OF MURDERERS");

[...assassinos].sort(comparar).forEach(e => {
  if (!assassinados.has(e[0])) console.log(`${e[0]} ${e[1]}`);
});

function comparar(a, b) {
  if (a[0] < b[0]) return -1;
  else if (a[0] > b[0]) return 1;
  return 0;
}
