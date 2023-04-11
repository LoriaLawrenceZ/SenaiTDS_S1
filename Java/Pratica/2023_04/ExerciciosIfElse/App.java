package ExerciciosIfElse;

import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exercicios exercicios = new Exercicios();

        String escolha = "";

        do {
            System.out.println("\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6]- Exercício 6\n[7] - Exercício 7\n[8] - Exercício Extra 1\n[9] - Exercício Extra 2\n[10] - Exercício Extra 3\n[11] - Exercício Extra 4\n[12] - Exercício Extra 5\n[S] - SAIR\n[Apenas Números]");

            escolha = in.next();

            switch (escolha) {
                case "1":
                    exercicios.compara();
                    break;
    
                case "2":
                    exercicios.votar();
                    break;
                
                case "3":
                    exercicios.validacao();
                    break;
    
                case "4":
                    exercicios.duziaMaca();
                    break;
    
                case "5":
                    exercicios.tresValores();
                    break;
    
                case "6":
                    exercicios.pesoIdeal();
                    break;
    
                case "7":
                    exercicios.notaFrequencia();
                    break;
    
                case "8":
                    exercicios.imparOuPar();
                    break;
    
                case "9":
                    exercicios.passaReprova();
                    break;
    
                case "10":
                    exercicios.vogalConsoante();
                    break;
    
                case "11":
                    exercicios.salarioColaborador();
                    break;
    
                case "12":
                    exercicios.folhaPagamento();
                    break;

                case "S":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
    
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "N";
                    break;
            }

        } while (escolha != "N");

        in.close();
    }
}