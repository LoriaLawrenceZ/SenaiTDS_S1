package ListaExtraMatriz;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Extras {
      Scanner sc = new Scanner(System.in, "latin1");
      Random rd = new Random();

      public void Extra1(){
            int matriz[][] = new int[4][4];

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = i+1 * j+1;
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

      public void Extra2(){
            int matriz[][] = new int[4][4], maiorValor = 0, localizadorL = 0, localizadorC = 0;

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

            //Procurando e Imprimindo maior valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        if(matriz[i][j] >= maiorValor){
                              maiorValor = matriz[i][j];
                              localizadorL = i;
                              localizadorC = j;
                        }
                  }
            }

            System.out.println("O maior valor é: "+ maiorValor +"; Localizada na posição ["+ (localizadorL+1) +"]["+ (localizadorC+1) +"]");
      }

      public void Extra3(){
            int matriz[][] = new int[5][5], x, localizadorL = 0, localizadorC = 0;

            //Dando valor; Recebendo x
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = rd.nextInt(10);
                  }
            }

            System.out.println("Insira um valor para verificar se está na matriz\n[1 - 9]");
            x = sc.nextInt();

            //Procurando X e Imprimindo sua localização
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        if(x == matriz[i][j]){
                              localizadorL = i;
                              localizadorC = j;
                        }
                  }
            }

            if(x == 0){
                  System.out.println("Não encontrado");
            }
            else{
                  System.out.println("X foi encontrado em: ["+ (localizadorL+1) +"]["+ (localizadorC+1) +"]");
            }
      }

      public void Extra4(){
            int matriz[][] = new int[10][10];

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        if(i < j){
                              matriz[i][j] = (2*i + 7*j) - 2;
                        }
                        else if(i == j){
                              matriz[i][j] = (int) Math.pow((3*i), 2) - 1;
                        }
                        else{
                              matriz[i][j] =(int) ((Math.pow((4*i), 3) - Math.pow((5*i), 2)) + 1);
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

      public void Extra5(){
            double matriz[][] = new double[5][4], matriculaMN = 0, mediaPonderada = 0;
            int localizadorL = 0;

            //Dando valor
            for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz[i].length; j++) {
                        switch (j) {
                              case 0:
                                    System.out.println("Insira o número de matrícula.\nApenas números");
                                    int number = sc.nextInt();

                                    while((int)(number * 10) % 10 != 0 ){
                                          System.out.println("Insira um valor válido\n[Número inteiro]");
                                          number = sc.nextInt();
                                    }
                                    matriz[i][j] = number;
                                    break;

                              case 1:
                                    System.out.println("Insira a média das provas.\nApenas números");
                                    matriz[i][j] = sc.nextDouble();
                                    break;

                              case 2:
                                    System.out.println("Insira a média dos trabalhos.\nApenas números");
                                    matriz[i][j] = sc.nextDouble();
                                    break;

                              case 3:
                                    matriz[i][j] = (matriz[i][j-2] + matriz[i][j-1]) / 2;
                                    break;
                        
                              default:
                                    break;
                        }
                  }
            }

            //Matrícula do aluno com maior nota
            for (int i = 0; i < matriz.length; i++) {
                  if(matriz[i][3] >= matriculaMN){
                        localizadorL = i;
                  }
            }
            //Imprimindo aluno com maior nota
            System.out.println("Matrícula do aluno com maior nota final:\n"+ matriz[localizadorL][3]);

            //Média Aritmética de todas as notas finais
            for (int i = 0; i < matriz[i].length; i++) {
                  mediaPonderada += matriz[i][3];
            }
            //Imprimindo Resultados
            System.out.println("A média aritmética de todas as notas finais é:\n"+ (mediaPonderada / 5));
      }

      public void Extra6(){
            double A[][] = new double[3][3];
            double B[][] = new double[3][3];
            double C[][] = new double[3][3];

            //Dando valor;
            for (int i = 0; i < A.length; i++) {
                  for (int j = 0; j < A[i].length; j++) {
                        A[i][j] = rd.nextInt(10);
                        B[i][j] = rd.nextInt(10);
                  }
            }

            //Calculando C
            for (int i = 0; i < C.length; i++) {
                  for (int j = 0; j < C[i].length; j++) {
                        double soma = A[i][j] + B[j][i];
                  }
            }
      }
}
