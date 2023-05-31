package POOElevador;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int andarTotal;
        int capacidadeElevador;
        String sOUn;
        String oqFazer;

        System.out.println("Quantos andares há no prédio?");
        andarTotal = sc.nextInt();

        System.out.println("Qual a capaxidade máxima do elevador?");
        capacidadeElevador = sc.nextInt();

        Predio predio = new Predio(andarTotal, capacidadeElevador);
        
        System.out.println("Deseja controlar o elevador?\n[S]im  [N]ão");
        sOUn = sc.next();
        while(!sOUn.equalsIgnoreCase("s") && !sOUn.equalsIgnoreCase("n")){
            System.out.println("Insira uma resposta válida!\n[S]im  [N]ão");
            sOUn = sc.next();
        }

        if(sOUn.equalsIgnoreCase("s")){
            do {
                System.out.println("\n----------------------------\n"+ predio.getAndarAtual() +"° andar | "+ predio.getPessoasPresentes() +" pessoas. O que deseja fazer?\n[A]diciona 1 pessoa | [R]emove 1 pessoa | [S]obe 1 andar | [D]esce 1 andar | [0] Sair");
                oqFazer = sc.next().toUpperCase();

                switch (oqFazer) {
                    case "A":
                        predio.AdicionaPessoa();
                        break;

                    case "R":
                        predio.RemovePessoa();
                        break;

                    case "S":
                        predio.SubirAndar();
                        break;

                    case "D":
                        predio.DescerAndar();
                        break;

                    case "0":
                        System.out.println("\n------------------------------------------=====Encerrando Programa=====------------------------------------------");
                        break;
                
                    default:
                    System.out.println("Valor inválido Inserido");
                        break;
                }

            } while (!oqFazer.equalsIgnoreCase("0"));
        }
        else{
            System.out.println("\n------------------------------------------=====Encerrando Programa=====------------------------------------------");
        }

        sc.close();
    }
}