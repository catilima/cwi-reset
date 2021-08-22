let gaveteiros = []
gaveteiros[0] = []
gaveteiros[1] = []

gaveteiros[0][0] = "gaveta 1"
gaveteiros[0][1] = "gaveta 2"

gaveteiros[1][0] = "gaveta 3"
gaveteiros[1][1] = "gaveta 4"

console.log(gaveteiros)
for (let l = 0; l < gaveteiros.length; l++) {
    for (let c = 0; c < gaveteiros[l].length; c++) {
        console.log(l + " - " + c + " = " + gaveteiros[l][c])
    }
}
