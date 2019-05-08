var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

function printPrime(value) {
  var primes = [];
  for (var i = 2; i < value; i++) {
    primes[i] = true;
  }
  var limit = Math.sqrt(value);
  for (var i = 2; i < limit; i++) {
    if (primes[i] === true) {
      for (var j = i * i; j < value; j += i) {
        primes[j] = false;
      }
    }
  }
  for (var i = 2; i < value; i++) {
    if (primes[i] === true) {
      console.log(i + " " + primes[i]);
    }
  }
}
