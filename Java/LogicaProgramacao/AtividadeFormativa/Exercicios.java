package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        int mUsuario[][], mLinhas, mColunas;

        System.out.println("Insira a quantidade de LINHAS da matriz\n[Número INTEIRO]");
        mLinhas = sc.nextInt();
        System.out.println("Insira a quantidade de COLUNAS da matriz\n[Número INTEIRO]");
        mColunas = sc.nextInt();

        mUsuario = new int[mLinhas][mColunas];

        // Dando valor
        for (int i = 0; i < mUsuario.length; i++) {
            for (int j = 0; j < mUsuario[i].length; j++) {
                mUsuario[i][j] = rd.nextInt(10);
            }
        }
        // Imprimir tabulado
        for (int i = 0; i < mUsuario.length; i++) {
            System.out.print("|");
            for (int j = 0; j < mUsuario[i].length; j++) {
                System.out.print(" " + mUsuario[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("\n--------------------------------------------------------------------------------------------\n");

        // Dando valor baseado nas condições
        for (int i = 0; i < mUsuario.length; i++) {
            for (int j = 0; j < mUsuario[i].length; j++) {
                if (i > j) {
                    mUsuario[i][j] = 1;
                } else if (i == j) {
                    mUsuario[i][j] = 0;
                } else {
                    mUsuario[i][j] = 2;
                }
            }
        }
        // Imprimir tabulado baseado nas condições
        for (int i = 0; i < mUsuario.length; i++) {
            System.out.print("|");
            for (int j = 0; j < mUsuario[i].length; j++) {
                System.out.print(" " + mUsuario[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void Exercicio2() {
        int num = rd.nextInt(101), contador = 1, numChute;

        System.out.println("Tente adivinhar o número que estou pensando.\n[0 - 100]\n[Número Inteiro]");
        numChute = sc.nextInt();

        while(numChute != num){
            if (numChute > num) {
                System.out.println("Errou! O número que escolhi é menor que o informado.");
                contador++;

                System.out.println("Tente advinhar novamente.");
                numChute = sc.nextInt();
            }
            else {
                System.out.println("Errou! O número que escolhi é maior que o informado.");
                contador++;

                System.out.println("Tente advinhar novamente.");
                numChute = sc.nextInt();
            }
        }

        if (contador == 1) {
            System.out.println("UAU! Parabéns, você acertou de PRIMEIRA!!!");
        } else {
            System.out.println("Parabéns, você acertou após "+ contador +" tentativas");
        }
    }

    public void Exercicio3() {
        int vetor[], contador = 0;
        
        vetor = new int[rd.nextInt(900) + 100];

        //Dando valor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }
        // Imprimir tabulado
        for (int i : vetor) {
            System.out.print(vetor[i] +"; ");
        }

        // Imprimir tabulado pares
        System.out.println("\n---------------------------------------------------------------------------\nValores pares\n");
        for (int i : vetor) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " | ");
            }
        }
        // Imprimir tabulado ímpares
        System.out.println("\n---------------------------------------------------------------------------\nValores ímpares\n");
        for (int i : vetor) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " | ");
            }
        }

        //Procurando quem se encaixa nas condições pares em ímpares
        for (int i : vetor) {
            if ((i + 1) % 2 != 0 & vetor[i] % 2 == 0) {
                contador++;
            }
        }
        //Imprimindo Condição
        System.out.println("\nNeste vetor existem "+ contador +" números pares nas posições ímpares do vetor");

        //Procurando quem se encaixa nas condições impares em pares
        contador = 0;
        for (int i : vetor) {
            if ((i + 1) % 2 == 0 & vetor[i] % 2 != 0) {
                contador++;
            }
        }
        //Imprimindo Condição
        System.out.println("\nNeste vetor existem "+ contador +" números ímpares nas posições pares do vetor");

    }

    /*
     * 3. Escreva um programa que:
     * Sortear o tamanho de uma vetor de minimo 100 e máximo 1000
     * Construir o vetor
     * Listar o vetor com números aleatórios de 1 a 100
     * Exibir apenas os números pares do vetor
     * Exibir apenas os números ímpares do vetor
     * Exibir a quantidade de números pares existem nas posições ímpares do vetor
     * Exibir a quantidade de números ímpares existem nas posições pares do vetor
     */
}
