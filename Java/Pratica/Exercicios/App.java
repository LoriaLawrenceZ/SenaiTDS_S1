package Exercicios;

import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exercicios exercicios = new Exercicios();

        System.out.println("Escolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6]- Exercício 6\n[7] - Exercício Extra 1\n[8] - Exercício Extra 2\n[9] - Exercício Extra 3\n[10] - Exercício Extra 4\n[11] - Exercício Extra 5\n[Apenas Números]");
        int escolha = in.nextInt();
        
        switch (escolha) {
            case 1:
                exercicios.Compara();
                break;

            case 2:
                exercicios.Votar();
                break;
            
            case 3:
                exercicios.Validacao();
                break;

            case 4:
                exercicios.DuziaMaca();
                break;

            case 5:
                exercicios.TresValores();
                break;

            case 6:
                exercicios.PesoIdeal();
                break;

            case 7:
                exercicios.ImparOuPar();

            case 8:
                exercicios.PassaReprova();

            case 9:
                exercicios.VogalConsoante();

            case 10:
                exercicios.SalarioColaborador();

            case 11:
                exercicios.FolhaPagamento();

            default:
                System.out.println("Insira um valor válido da próxima vez");
                break;
        }

        in.close();
    }
}