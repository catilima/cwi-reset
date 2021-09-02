package com.company;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String captura = scan.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + captura);

      }
}


