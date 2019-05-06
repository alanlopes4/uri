var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var size = lines.length;

var assassinos = [];
var assassinados = [];
for (let i = 0; i < size; i++) {
  let [assassino, assassinado] = lines.shift().split(" ");
  let idx = assassinos.findIndex((e, idx) => {
    if (e.assassino == assassino) return true;
  });
  if (idx == -1) assassinos.push({ assassino: assassino, quantidade: 1 });
  else assassinos[idx].quantidade++;
  assassinados.push(assassinado);
}
console.log("HALL OF MURDERERS");
assassinos.sort((a, b) => {
  if (a.assassino < b.assassino) return -1;
  else if (a.assassino > b.assassino) return 1;
  return 0;
});
assassinos.forEach(e => {
  if (!assassinados.includes(e.assassino)) {
    console.log(`${e.assassino} ${e.quantidade}`);
  }
});
