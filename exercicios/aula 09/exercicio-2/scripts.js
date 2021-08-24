//Verificar se dois nomes são iguais

function mesmoNome(nomeBeltrano, nomeFulano) {
    return (nomeBeltrano == nomeFulano)
}

//Verificar Maioridade

function maiorDeIdade(idade) {
    return idade >= 18
}

//Calcular valor do boleto com juros.

function valorComJuros(valorBoleto) {
    return valorBoleto * 1.1
}

//Calcular média aritmética.

function mediaAritmetica(itens) {
    soma = 0
    for (i = 0; i < itens.length; i++) {
        soma = soma + itens[i]

    }
    return soma / itens.length
}

//Calcular margem bruta.

function margemBruta(receitaLiquida, custoProduto) {
    lucroBruto = receitaLiquida - custoProduto
    return (lucroBruto / receitaLiquida) * 100
}

function imprimir(conteudo) {
    console.log(conteudo)

}


cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false

imprimir("---")

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]