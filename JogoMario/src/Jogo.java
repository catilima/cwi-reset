public class Jogo {
    public static void main(String[] args) {
        Mario p1 = new Mario();
        p1.nome = "Mário";
        p1.pele = "pele clara";
        p1.olhos = "olhos azuis brilhantes";
        p1.nariz = "nariz grande";
        p1.altura = 1.55f;
        p1.acessorio = "boné vermelho com o símbolo “M”";
        p1.bigode = "bigode grosso castanho-escuro";
        p1.cabelo = " curto castanho com duas costeletas, franjas grandes, um topete ";
        p1.roupa = " camisa vermelha, um macacão azul com botões amarelos";
        p1.profissao = "Encanador";
        p1.vivo = true;
        p1.percentualVida = 100;
        p1.abertura();
        p1.poderes();
        p1.emoji = 0x270C;

    }
}
