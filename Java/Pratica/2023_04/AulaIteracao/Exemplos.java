package AulaIteracao;

import java.util.Scanner;

public class Exemplos {
    Scanner sc = new Scanner(System.in, "latin1");

    public void ExemploWhile(){
        int vetor[] = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.println("Insira o "+ (i+1) +"° valor:");
            vetor[i] = sc.nextInt();

            i++;
        }

        System.out.println("-----------------------\nOs valores do vetor de 10 posições por ordem inversa de inserção são:");
        while (i > 0) {
            i--;
            System.out.print(vetor[i] +"; ");
        }
    }

    public void ExemploDoWhile(){
        
    }

    public void ExemploFor(){}
}
