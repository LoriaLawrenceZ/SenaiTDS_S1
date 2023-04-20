package ExerciciosExtraForWhile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Exercicios obj = new Exercicios();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6] - Exercício 6\n[7] - Exercício 7\n[8] - Exercício 8\n[9] - Exercício 9\n[10] - Exercício 10\n[11] - Exercício 11\n[12] - Exercício 12\n[S] - SAIR\n[Apenas Números]");
    
            escolha = sc.next();
    
            switch (escolha) {
                case "1":
                    obj.userSenha();
                    break;
    
                case "2":
                    obj.dados();
                    break;
                
                case "3":
                    obj.populacao();
                    break;

                case "4":
                    obj.populacao2();
                    break;

                case "5":
                    obj.numMaior();
                    break;

                case "6":
                    obj.divisivel();
                    break;

                case "7":
                    obj.gerarNum();
                    break;
    
                case "8":
                    obj.tabuada();
                    break;
                
                case "9":
                    obj.potencia();
                    break;

                case "10":
                    obj.fibonacci();
                    break;

                case "11":
                    obj.fatorial();
                    break;

                case "12":
                    obj.primo();
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
    
        }while(escolha!="N");

        sc.close();
    }
}