var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var [m, n] = lines.shift().split(" ");

var dicionario = [];
var pontos = 0;
var salario = 0;
while (m-- > 0) {
  let [palavra, valor] = lines.shift().split(" ");
  dicionario.push({ palavra: palavra, valor: valor });
}

while (pontos != n) {
  let linha = lines.shift().split(" ");
  if (linha[0] != ".") {
    salario += linha.reduce((acc, p) => {
      let soma = 0;
      dicionario.forEach(e => {
        if (e.palavra == p) soma += parseInt(e.valor);
      });
      return acc + soma;
    }, 0);
  } else {
    pontos++;
    console.log(salario);
    salario = 0;
  }
}
