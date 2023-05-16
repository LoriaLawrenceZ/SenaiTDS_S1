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
        for (int i = 0; i < 10; i++) {
            System.out.println("O número da iteração é "+ i);
        }
    }

    public void Exemplo4(){
        double carrinhoCompra[] = new double[]{25.50, 55.90, 69.99};
        double valorFinalCompra = 0;

        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinalCompra += carrinhoCompra[i];
        }

        System.out.println("O valor total da compra é: R$ "+ valorFinalCompra);
    }
}
