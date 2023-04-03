package ExerciciosExtraVetores;

import java.util.Scanner;
import java.lang.Math;

public class Exercicios{
    Scanner in = new Scanner(System.in,"latin1");

    public void Exercicio1(){
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("\nInsira cinco(5) números em sequência, eles serão os números do vetor.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }

        System.out.println("Os números inseridos, por ordem de inserção são:\n--->Vetor A:\n"+ vetorA[0] +"\n"+ vetorA[1] +"\n"+ vetorA[2] +"\n"+ vetorA[3] +"\n"+ vetorA[4] +"\n--->Vetor B:\n"+ vetorB[0] +"\n"+ vetorB[1] +"\n"+ vetorB[2] +"\n"+ vetorB[3] +"\n"+ vetorB[4]);
    }

    public void Exercicio2(){
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        System.out.println("\nInsira oito(8) números em sequência, eles serão os números do vetor.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (2 * vetorA[i]);
        }

        System.out.println("Os números inseridos, por ordem de inserção são:\n--->Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("--->Vetor B:\n[Valor de Vetor A multiplicado por 2]");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

    public void Exercicio3(){
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        System.out.println("\nInsira 15 números em sequência, eles serão os números do vetor.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (vetorA[i] * vetorA[i]);
        }

        System.out.println("Os números inseridos, por ordem de inserção são:\n--->Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("--->Vetor B:\n[Valor de Vetor A ao quadrado]");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

    public void Exercicio4(){
        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        System.out.println("\nInsira 15 números em sequência, eles serão os números do vetor.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("Os números inseridos, por ordem de inserção são:\n--->Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("--->Vetor B:\n[Valor da raiz quadrada do Vetor A]");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

    public void Exercicio5(){
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("\nInsira 10 números em sequência, eles serão os números do vetor.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (vetorA[i] * i);
        }

        System.out.println("Os números inseridos, por ordem de inserção são:\n--->Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("--->Vetor B:\n[Valor do Vetor A multiplicado pelo seu índice]");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }

    public void Exercicio6(){
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("\nInsira 10 números em sequência, eles serão os números do vetor A.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }

        System.out.println("\nInsira 10 números em sequência, eles serão os números do vetor B.\n[Apenas números]\n[Tecle 'ENTER' quando tiver escrito o número]");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = in.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = (vetorA[i] + vetorB[i]);
        }
    }
}