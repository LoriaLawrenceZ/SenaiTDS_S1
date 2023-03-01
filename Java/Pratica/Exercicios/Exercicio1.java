package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    Scanner in = new Scanner(System.in, "latin1");

    public void Compara(){
        System.out.println("Insira um primeiro número");
        double num1 = in.nextDouble();

        System.out.println("Insira um segundo número");
        double num2 = in.nextDouble();

        if(num1 > num2){
            System.out.println("O maior número é o primeiro número, "+ num1);
        }
        else if(num1 < num2){
            System.out.println("O maior número é o segundo número, "+ num2);
        }
        else{
            System.out.println("Os números inseridos são de mesmo valor");
        }
    }
}
