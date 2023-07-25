package ExerciciosVetores;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Exercicios obj = new Exercicios();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6] - Exercício 6\n[7] - Exercício 7\n[8] - Exercício 8\n[9] - Exercício 9\n[S] - SAIR\n[Apenas Números]");
    
            escolha = in.next();
            escolha = escolha.toLowerCase();
    
            switch (escolha) {
                case "1":
                    obj.cincoInteiros();
                    break;
    
                case "2":
                    obj.dezInverso();
                    break;
                
                case "3":
                    obj.media();
                    break;

                case "4":
                    obj.consoante();
                    break;

                case "5":
                    obj.imPar();
                    break;

                case "6":
                    obj.mediaAlunos();
                    break;

                case "7":
                    obj.operacoes();
                    break;

                case "8":
                    obj.idadeAltura();
                    break;

                case "9":
                    obj.somQua();
                    break;

                case "s":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
    
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "N";
                    break;
            }
    
        }while(escolha!="N");

        in.close();
    }

    
}
