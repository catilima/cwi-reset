let nomeCompleto = "Catiucia C D L da Silva"
let apelido = "Cati"
let idade = 32
let dataNascimento = "05/10/1988"
let localNascimento = "São Leopoldo/RS"
let altura = 1.60
let trabalhando = true

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + "."

console.log(apresentacao);
