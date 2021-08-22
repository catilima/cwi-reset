let valores = [2, 4, 6, 8, 10, 20, 30, 100, 200, 450]
let somaValores = 0

for (let i = 0; i < valores.length; i++) {
    let element = valores[i];
    somaValores = somaValores + element
    //console.log(somaValores)
}

let media = somaValores / valores.length

console.log("A média dos valores é de " + media);
