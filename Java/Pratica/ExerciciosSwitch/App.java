package ExerciciosSwitch;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        Exercicios exercicios = new Exercicios();
    
        String escolha ;
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\nEscolha qual exercício deseja ver:\n[1] - Exercício 1\n[2] - Exercício 2\n[Apenas Números]");
    
            escolha = in.next();
    
            switch (escolha) {
                case "1":
                    exercicios.VogalConsoante();
                    break;
    
                case "2":
                    exercicios.NumeroMes();
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
