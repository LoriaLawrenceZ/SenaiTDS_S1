package AulaMatriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin1");
        
        Exemplos obj = new Exemplos();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual exemplo deseja ver:\n[1] - Exemplo 1\n[2] - Exemplo 2\n[3] - Exemplo 3\n[4] - Exemplo 4\n[S] - SAIR\n[Apenas Números]");
    
            escolha = sc.next().toLowerCase();
    
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

                  case "4":
                        obj.Exemplo4();
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

        sc.close();
    }
}