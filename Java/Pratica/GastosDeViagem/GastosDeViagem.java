package GastosDeViagem;

import java.util.Scanner;

public class GastosDeViagem {
    public static void main(String[] args) {
        double distanciaCidades, kmLitro, valorLitro, gastoTotal;

        Scanner read = new Scanner(System.in);

        System.out.println("===CALCULADORA DE GASTOS DE VIAGEM===");

        System.out.println("Qual é a distancia a ser percorrida (em quilômetros) entre as cidades que deseja viajar? [Apenas números]");
        distanciaCidades = read.nextDouble();

        System.out.println("Quantos quilômetros o carro de viagem consegue percorrer com um litro de combustível? [Apenas números]");
        kmLitro = read.nextDouble();

        System.out.println("Qual o valor de um litro de combustível? [Apenas números]");
        valorLitro = read.nextDouble();

        gastoTotal = (distanciaCidades / kmLitro) * valorLitro;

        System.out.println("O valor a ser gasto na viagem será de "+gastoTotal+" reais");

        read.close();
    }
}
