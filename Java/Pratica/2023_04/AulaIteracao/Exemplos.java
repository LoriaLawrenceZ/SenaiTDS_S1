package AulaIteracao;

import java.util.Random;
import java.util.Scanner;

public class Exemplos {
    Scanner sc = new Scanner(System.in, "latin1");

    public void Exemplo1(){
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
    
    public void Exemplo2(){
        Random rd = new Random();

        int nDigitado, nRandom = rd.nextInt(10)+1;
        boolean tenteDNV = true;

        while(tenteDNV){
            System.out.println("Digite um número de 1 a 10");
            nDigitado = sc.nextInt();

            if (nDigitado == nRandom){
                System.out.println("Acertou!");
                tenteDNV = false;
            }
            else{
                System.out.println("Errou! Tente novamente");
            }
        }
    }

    public void Exemplo3(){
        
    }

    public void ExemploFor(){}
}
