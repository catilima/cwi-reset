public class Personagem {

    private String nome;
    private String pele;
    private String olhos;
    private String nariz;
    private float altura;
    private String acessorio;
    private String bigode;
    private String cabelo;
    private String roupa;
    private String profissao;
    private boolean vivo;
    private int estamina;
    private int idade;



    public Personagem() {
        this.nome = "Mario Bros";
        this.idade = 40;
        this.estamina = 100;
        this.altura = 1.50f;
    }

    public Personagem(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public void abertura() {
        System.out.println("Olá sou eu, " + this.nome + "... oki doki");
        if (this.pele != null) {
            System.out.println("Minha pele é: " + this.pele);
        }
        if (this.olhos != null) {
            System.out.println("Meus olhos são: " + this.olhos);
        }
        if (this.nariz != null) {
            System.out.println("Meu nariz é: " + this.nariz);
        }
        if (this.altura > 0) {
            System.out.println("Minha altura é: " + this.altura);
        }
        if (this.acessorio != null) {
            System.out.println("Eu uso: " + this.acessorio + ", " + this.roupa);
        }
        if (this.bigode != null) {
            System.out.println("Meu bigode é: " + this.bigode);
        }
        if (this.cabelo != null) {
            System.out.println("Tenho o cabelo cor: " + this.cabelo);
        }
        if (this.profissao != null) {
            System.out.println("Minha profissão é: " + this.profissao);
        }
        if (this.idade > 0) {
            System.out.println("Minha idade é: " + this.idade);
        }
        if (this.estamina > 0) {
            System.out.println("Estou com " + this.estamina + "% de estamina");
        }
        System.out.println(" ");
        System.out.println("Alguns dos meus super poderes são: ");

    }

    public void poderes() {
        System.out.println("Super Força, Super Pulo, Speed e Sou incansável");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPele() {
        return pele;
    }

    public void setPele(String pele) {
        this.pele = pele;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getNariz() {
        return nariz;
    }

    public void setNariz(String nariz) {
        this.nariz = nariz;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getBigode() {
        return bigode;
    }

    public void setBigode(String bigode) {
        this.bigode = bigode;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }


}
