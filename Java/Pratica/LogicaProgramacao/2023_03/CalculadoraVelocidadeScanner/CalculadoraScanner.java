package CalculadoraVelocidadeScanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular(){
        Scanner read = new Scanner(System.in);

        System.err.println("Informe a distância percorrida.");
        double distanciaPercorrida = read.nextDouble();

        System.out.println("A distância percorrida foi de "+distanciaPercorrida+" km");

        System.out.println("Informe o tempo gasto na viagem.");
        double tempoGasto = read.nextDouble();

        System.out.println("O tempo gasto na viagem foi de "+tempoGasto+" horas");

        read.close();
    }
}