package Exercicios;

import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();
        Exercicio5 exercicio5 = new Exercicio5();
        Exercicio6 exercicio6 = new Exercicio6();

        System.out.println("Escolha qual exercício deseja ver\n[Apenas Números]\n[1] [2] [3] [4] [5] [6]");
        int escolha = in.nextInt();
        
        switch (escolha) {
            case 1:
                exercicio1.Compara();
                break;

            case 2:
                exercicio2.Votar();
                break;
            
            case 3:
                exercicio3.Validacao();
                break;

            case 4:
                exercicio4.DuziaMaca();
                break;

            case 5:
                exercicio5.TresValores();
                break;

            case 6:
                exercicio6.PesoIdeal();
                break;

            default:
                System.out.println("Insira um valor válido da próxima vez");
                break;
        }

        in.close();
    }
}