package ExerciciosIteracao;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in, "latin1");

    public void Exercicio1(){
        double vetor[] = new double[5];

        System.out.println("Insira números para o vetor de 5 itens:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Itens do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+ i +"] : "+ vetor[i]);
        }
    }

    public void Exercicio2(){
        double vetor[] = new double[10];

        System.out.println("Insira números reais para o vetor de 10 itens:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Itens do vetor na ordem inversa:");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println("vetor["+ i +"] : "+ vetor[i]);
        }
    }

    public void Exercicio3(){
        double notas[] = new double[4], media;

        System.out.println("Insira as notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            notas[i]+= notas[i - 1];
        }
        media = notas[3]/4;
        System.out.println("Média:"+ media);
    }

    public void Exercicio4(){
        String palavra;
        char letra[] = new char[5];

        System.out.println("Insira uma palavra de até no máximo 10 letras");
        palavra = sc.next().toLowerCase();
        for (int i = 0; i < letra.length; i++) {
            letra[i] = palavra.charAt(i);
        }
        
        System.out.println("Consoantes utilizadas: ");
        for (int i = 0; i < letra.length; i++) {
            if(letra[i] == 'a' || letra[i] == 'e' || letra[i] == 'i' || letra[i] == 'o' || letra[i] == 'u' ){
                System.out.println(letra[i]);
            }
        }
    }

    public void Exercicio5(){
        int numeros[] = new int[20], p=1, pi = 0, pares[], i=1, ii = 0, impares[];

        System.out.println("Insira números para o vetor de 20 itens:");
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = sc.nextInt();
        }

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                p++;
            }
            else{
                i++;
            }
        }
        pares = new int[p];
        impares = new int[i];

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 2 == 0) {
                pares[pi] = numeros[j];
                pi++;
            } else {
                impares[ii] = numeros[j];
                ii++;
            }
        }
    }

    public void Exercicio6(){}

    public void Exercicio7(){}

    public void Exercicio8(){}

    public void Exercicio9(){}
}
