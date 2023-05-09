package AulaMatriz;

import java.util.Random;
import java.util.Scanner;

public class Exemplos {
      Scanner sc = new Scanner(System.in, "latin1");
      Random rd = new Random();

      public void Exemplo1(){
            int matriz[][] = new int[10][10]; //Matriz de 2 dimensões

            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.println("matriz["+ i +"]["+ j +"]= ");
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.println("matriz["+ i +"]["+ j +"]= "+ matriz[i][j]);
                  }
            }
      }

      public void Exemplo2(){
            int matriz[][] = new int[10][10]; //Matriz de 2 dimensões

            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            //Imprimir tabulado
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(" "+ matriz[i][j] +" ");
                  }
                  System.out.println("|");
            }
      }

      public void Exemplo3(){
            int matriz[][] = new int[10][10], soma = 0; //Matriz de 2 dimensões

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            //Imprimir tabulado
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(" "+ matriz[i][j] +" ");
                  }
                  System.out.println("|");
            }

            //Soma de todos os itens da linha
            for (int i = 0; i < matriz[3].length; i++) {
                  soma += matriz[3][i];
            }

            System.out.println(soma);
      }

      public void Exemplo4(){
            int matriz[][] = new int[10][10], soma = 0; //Matriz de 2 dimensões

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            //Imprimir tabulado
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(" "+ matriz[i][j] +" ");
                  }
                  System.out.println("|");
            }

            //Soma de todos os itens da coluna
            for (int i = 0; i < matriz.length; i++) {
                  soma += matriz[i][3];
            }

            System.out.println(soma);
      }

      public void Desafio1(){
            int matriz[][] = new int[5][5], soma = 0; //Matriz de 2 dimensões

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        if(i == j){
                              matriz[i][j] = 1;
                        }
                  }
            }

            //Imprimir tabulado
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(" "+ matriz[i][j] +" ");
                  }
                  System.out.println("|");
            }
      }

      public void Desafio2(){
            int matriz[][] = new int[5][5], matrizT[][] = new int[5][5]; //Matriz de 2 dimensões

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            //Imprimir tabulado - Antes
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(" "+ matriz[i][j] +" ");
                  }
                  System.out.println("|");
            }

            //Gerando Matriz Transposta
            System.out.println("------------------------------------");
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz.length; j++) {
                        matrizT[i][j] = matriz[j][i];
                  }
            }

            //Imprimir tabulado - Depois
            //Transposta
            for (int i = 0; i < matriz.length; i++) {

                  System.out.print("|");
                  for (int j = 0; j < matriz.length; j++) {
                        System.out.print(" "+ matrizT[i][j] +" ");
                  }
                  System.out.println("|");
            }
      }
}