public class Jogo {
    public static void main(String[] args) {

        System.out.println("Vamos jogar? "+" =D ");
        System.out.println(" ");

        Personagem p1 = new Personagem();
        p1.setNome("Mário1");
        p1.setPele("clara");
        p1.setOlhos("azuis brilhantes");
        p1.setNariz("grande");
        p1.setAltura(1.55f);
        p1.setAcessorio("boné vermelho com o símbolo “M”");
        p1.setBigode("grosso castanho-escuro");
        p1.setCabelo(" curto castanho com duas costeletas, franjas grandes, um topete ");
        p1.setRoupa(" camisa vermelha e um macacão azul com botões amarelos");
        p1.setProfissao("Encanador");
        p1.setVivo(true);
        p1.setEstamina(100);
        p1.abertura();
        p1.poderes();

        System.out.println(" ");
        Personagem p2 = new Personagem("Mario2", 40, 1.5f);
        p2.abertura();
        p2.poderes();

        System.out.println(" ");
        Personagem p3 = new Personagem();
        p3.abertura();
        p3.poderes();

    }
}

