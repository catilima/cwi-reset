let peso = 150
let altura = 1.60
let imc = (peso / (altura * altura)).toFixed(2)

let classificacao = ""
let grau = 0

if (imc < 18.50)
{
    classificacao = "Magreza"
    grau = 0
}
else if (imc >= 18.50 && imc <= 24.99)
{
    classificacao = "Normal"
    grau = 0
}
else if (imc >= 25 && imc <= 29.99)
{
    classificacao = "Sobrepeso"
    grau = 1
}
else if (imc >= 30 && imc <= 39.99)
{
    classificacao = "Obesidade"
    grau = 2
}
else if (imc >= 40)
{
    classificacao = "Obesidade Grave"
    grau = 3
}

console.log ("Seu IMC é de " + imc);
console.log ("Classificado como  " + classificacao);
console.log ("Grau de Obesidade " + grau);

if (grau >= 1)
{
    console.log ("Cuidado! Você está acima do peso recomendado pela OMS.")
}
if (grau == 3)
{
    console.log ("É importante procurar um médico para avaliar sua saúde.")
}
