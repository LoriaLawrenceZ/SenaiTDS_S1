package ListaExtraMatriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin1");
        
        Extras obj = new Extras();

        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual exemplo deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[3] - Exercício 3\n[4] - Exercício 4\n[5] - Exercício 5\n[6] - Exercício 6\n[S] - SAIR\n[Apenas Números]");
    
            escolha = sc.next().toLowerCase();
    
            switch (escolha) {
                  case "1":
                        obj.Extra1();
                        break;

                  case "2":
                        obj.Extra2();
                        break;

                  case "3":
                        obj.Extra3();
                        break;

                  case "4":
                        obj.Extra4();
                        break;

                  case "5":
                        obj.Extra5();
                        break;

                  case "a":
                        obj.Extra5();
                        break;

                  case "b":
                        obj.Extra6();
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