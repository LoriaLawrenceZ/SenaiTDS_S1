package ExerciciosVetores;

import java.util.Scanner;

public class Exercicios {
    Scanner in = new Scanner(System.in, "latin1");
    
    public void cincoInteiros(){
        int[] valores = new int[5];

        System.out.println("Insira um valor. [Número Inteiro]");
        valores[0] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[1] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[2] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[3] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[4] = in.nextInt();

        System.out.println("Listando os números pela ordem que foram informados\n"+ valores[0] +"; "+ valores[1] +"; "+ valores[2] +"; "+ valores[3] +"; "+ valores[4]);
    }

    public void dezInverso(){
        double[] valores = new double[10];

        System.out.println("Insira um valor. [Número Inteiro]");
        valores[9] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[8] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[7] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[6] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[5] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[4] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[3] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[2] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[1] = in.nextInt();
        System.out.println("Insira um valor. [Número Inteiro]");
        valores[0] = in.nextInt();

        System.out.println("Listando os números pela ordem inversa ao que foram informados\n"+ valores[0] +"; "+ valores[1] +"; "+ valores[2] +"; "+ valores[3] +"; "+ valores[4] +"; "+ valores[5] +"; "+ valores[6] +"; "+ valores[7] +"; "+ valores[8] +"; "+ valores[9]);
    }

    public void media(){
        double notas[] = new double[4];
        
        System.out.println("Insira a primeira nota\n[0 - 10]");
        notas[0] = in.nextDouble();
        System.out.println("Insira a primeira nota\n[0 - 10]");
        notas[1] = in.nextDouble();
        System.out.println("Insira a primeira nota\n[0 - 10]");
        notas[2] = in.nextDouble();
        System.out.println("Insira a primeira nota\n[0 - 10]");
        notas[3] = in.nextDouble();
        
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("Notas do aluno:\n"+ notas[0] +"\n"+ notas[1] +"\n"+ notas[2] +"\n"+ notas[3] +"\nMédia do Aluno: "+ media);
    }
}
