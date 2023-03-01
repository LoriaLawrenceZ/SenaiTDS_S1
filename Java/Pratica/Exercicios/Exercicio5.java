package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    Scanner in = new Scanner(System.in, "latin1");

    public void TresValores(){
        System.out.println("Insira um valor");
        double num1 = in.nextDouble();

        System.out.println("Insira um segundo valor");
        double num2 = in.nextDouble();

        System.out.println("Insira um terceiro valor");
        double num3 = in.nextDouble();

        if(num1 > num2 && num2 > num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num1 +", "+ num2 +", "+ num3);
        }
        else if(num1 > num2 && num2 < num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num1 +", "+ num3 +", "+ num2);
        }
        else if(num2 > num1 && num1 > num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num2 +", "+ num1 +", "+ num3);
        }
        else if(num2 > num1 && num1 < num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num2 +", "+ num3 +", "+ num1);
        }
        else if(num3 > num2 && num2 > num1){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num3 +", "+ num2 +", "+ num1);
        }
        else if(num3 > num2 && num2 < num1){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num3 +", "+ num1 +", "+ num2);
        }
    }
    
}
