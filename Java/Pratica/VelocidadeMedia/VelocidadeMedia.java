package VelocidadeMedia;

import java.util.Scanner;

/**
 * Velocidademedia
 */
public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float dp, tg, vm;   //criando variável da distância percorrida, tempo gasto e velocidade média

        System.out.println("Qual foi a distância percorrida pelo carro em quilômetros? (Apenas números)");
        dp = read.nextFloat();   // obtendo do usuário a distância percorrida

        System.out.println("Qual foi o tempo gasto em horas? (Apenas números)");
        tg = read.nextFloat();   //obtendo do usuário o tempo gasto

        vm = dp/tg; //calculando a velocidade média

        System.out.println("A velocidade média do carro é "+vm+" km/h");

        read.close();
        
    }
}