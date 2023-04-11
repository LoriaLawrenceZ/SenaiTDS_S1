package ExerciciosIteracao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Exercicios obj = new Exercicios();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual EXEMPLO deseja ver:\n[1] - Exemplo 1\n[2] - Exemplo 2\n[3] - Exemplo 3\n[4] - Exemplo 4\n[5] - Exemplo 5\n[6] - Exemplo 6\n[7] - Exemplo 7\n[8] - Exemplo 8\n[9] - Exemplo 9\n[S] - SAIR\n[Apenas Números]");
    
            escolha = in.next();
    
            switch (escolha) {
                case "1":
                    obj.Exercicio1();
                    break;
    
                case "2":
                    obj.Exercicio2();
                    break;
                
                case "3":
                    obj.Exercicio3();
                    break;

                case "4":
                    obj.Exercicio4();
                
                case "5":
                    obj.Exercicio5();
                    break;
    
                case "6":
                    obj.Exercicio6();
                    break;
                
                case "7":
                    obj.Exercicio7();
                    break;

                case "8":
                    obj.Exercicio8();

                case "9":
                    obj.Exercicio9();

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

        in.close();
    }
}
