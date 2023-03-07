package Exercicios;

import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exercicios exercicios = new Exercicios();

        String escolha = "1";

        do {
            System.out.println("\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6]- Exercício 6\n[7] - Exercício 7\n[8] - Exercício Extra 1\n[9] - Exercício Extra 2\n[10] - Exercício Extra 3\n[11] - Exercício Extra 4\n[12] - Exercício Extra 5\n[Apenas Números]");

            escolha = in.next();
            

            switch (escolha) {
                case "1":
                    exercicios.Compara();
                    break;
    
                case "2":
                    exercicios.Votar();
                    break;
                
                case "3":
                    exercicios.Validacao();
                    break;
    
                case "4":
                    exercicios.DuziaMaca();
                    break;
    
                case "5":
                    exercicios.TresValores();
                    break;
    
                case "6":
                    exercicios.PesoIdeal();
                    break;
    
                case "7":
                    exercicios.NotaFrequencia();
                    break;
    
                case "8":
                    exercicios.ImparOuPar();
                    break;
    
                case "9":
                    exercicios.PassaReprova();
                    break;
    
                case "10":
                    exercicios.VogalConsoante();
                    break;
    
                case "11":
                    exercicios.SalarioColaborador();
                    break;
    
                case "12":
                    exercicios.FolhaPagamento();
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