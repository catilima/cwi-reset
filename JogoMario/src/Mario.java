public class Mario {

    public String nome; //Mario
    public String pele; //Clara
    public String olhos; //Azuis Brilhantes
    public String nariz; //Grande
    public float altura; //1,55
    public String acessorio; //Bone
    public String bigode; //Bigode castanho-escuro
    public String cabelo; //Castanho curto com duas costeletas, franjas grandes e um topete
    public String roupa; //Macacão, camisa vermelha
    public String profissao; //Encanador
    public boolean vivo; //Vivo ou morto
    public int percentualVida; // 100%
    public char emoji;

    public void abertura() {
        System.out.println("Olá sou eu o, " + this.nome + "... oki doki");
        System.out.println("Tenho " + this.pele + ", " + this.olhos + ", " + this.nariz + ", " + this.altura + " de altura, cabelo " + this.cabelo + "e " + this.bigode + ".");
        System.out.println("Uso " + this.roupa + " e " + this.acessorio);
        System.out.println(" ");
        System.out.println("Alguns dos meus super poderes são: ");

    }

    public void poderes() {
        System.out.println("Super Força, Super Pulo, Speed e Sou incansável");
        System.out.println(" ");
        System.out.println("Vamos jogar? " + " =D ");
    }

    /*public void iniciar() {
        if (this.vivo == true) {
            System.out.println("Comece a correr ");
        } else {
            System.out.println("Você morreu, comece novamente! ");
        }
    }*/
}


