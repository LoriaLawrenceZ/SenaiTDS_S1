package ExerciciosNovoIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner in = new Scanner(System.in, "latin1");

    public void Exercicio1(){
        System.out.print("Insira um valor: ");
        double num = in.nextDouble();

        if(num < 10){
            System.out.println("O número inserido É MENOR QUE 10!");
        }
        else if(num == 10){
            System.out.println("O número É IGUAL A 10!");
        }
        else{
            System.out.println("O número É MAIOR QUE 10!");
        }
    }

    public void Exercicio2(){
        System.out.println("Qual a jornada de trabalho mensal? [Em HORAS]");
        int horasMes = in.nextInt();

        System.out.println("Qual o salário por hora?");
        double valorHora = in.nextDouble();

        if(horasMes <= 200){
            System.out.println("O salário total é:\n"+ (horasMes * valorHora) +" R$");
        }
        else{
            double valorHoraExtra = ((horasMes - 200) * valorHora) * 0.5;
            System.out.println("O salário total é:\n"+ ((horasMes * valorHora)+ valorHoraExtra) +" R$");
        }
    }

    public void Exercicio3(){
        System.out.println("Insira o salário FIXO do vendedor. [APENAS NÚMEROS]");
        double salarioVendedor = in.nextDouble();

        System.out.println("Insira o valor total das vendas. [APENAS NÚMEROS]");
        double valorVendas = in.nextDouble();

        if(valorVendas <= 2500){
            System.out.println("Salário total do vendedor é "+ (salarioVendedor + (0.3 * valorVendas)) +" R$");
        }else{
        }
    }
    
}