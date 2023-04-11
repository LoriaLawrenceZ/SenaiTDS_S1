package AulaIteracao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Exemplos obj = new Exemplos();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual EXEMPLO deseja ver:\n[1] - Exemplo 1\n[2] - Exemplo 2\n[3] - Exemplo 3\n[S] - SAIR\n[Apenas Números]");
    
            escolha = in.next();
    
            switch (escolha) {
                case "1":
                    obj.Exemplo1();
                    break;
    
                case "2":
                    obj.Exemplo2();
                    break;
                
                case "3":
                    obj.Exemplo3();
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

        in.close();
    }
}
