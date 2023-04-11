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
                    "\n------------------------------------------------------------------------------------\nEscolha qual EXEMPLO deseja ver:\n[1] - WHILE\n[2] - DO WHILE\n[3] - FOR\n[S] - SAIR\n[Apenas Números]");
    
            escolha = in.next();
    
            switch (escolha) {
                case "1":
                    obj.ExemploWhile();
                    break;
    
                case "2":
                    obj.ExemploDoWhile();
                    break;
                
                case "3":
                    obj.ExemploFor();
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
