package com.company;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String captura = scan.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + captura);

        /*System.out.println("Qual o primeiro número? ");
        int primeiroNumero = scan.nextInt();

        System.out.println("Qual o segundo número? ");
        int segundoNumero = scan.nextInt();

        System.out.println(" O resultado é: " + (primeiroNumero + segundoNumero));*/

    }
}


