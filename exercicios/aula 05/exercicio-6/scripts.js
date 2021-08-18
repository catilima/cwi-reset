let saldoInicial = 1000
let valorCalca = 99.90
let salario = 2500
let doacao = 0.10
let gastos = valorCalca + doacao
let saldo = (saldoInicial + salario) - gastos
let valorArcondicionado = saldo * (25 / 100)
let Antecipacao = saldo - valorArcondicionado 
let saldoFinal = Antecipacao /2

console.log ("Saldo Atual: " + "R$" + saldoFinal);


saldo = saldoInicial
saldo = saldo - valorCalca
saldo = saldo + salario
saldo = saldo - doacao
saldo = saldo - (saldo * (25 / 100)) //ar
saldo = saldo - (saldo / 2)

console.log ("Saldo Atual: " + "R$" + saldo);





