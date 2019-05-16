var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var n = lines.shift();

while (n-- > 0) {
  printPrime(parseInt(lines.shift()));
}

function isPrime(value) {
  if (num < 2) return false;
  var limit = Math.sqrt(value) + 1;
  for (var i = 2; i < limit; i++) if (num % i == 0) return false;
  return true;
}

function primeSieve(value) {
  var primes = [];
  primes.fill(true);
  primes[0] = false;
  primes[1] = false;
}
