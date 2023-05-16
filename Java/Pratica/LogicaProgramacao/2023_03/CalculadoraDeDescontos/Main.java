package CalculadoraDeDescontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "S", metodo;
        
        Scanner read = new Scanner(System.in);
        
        CalculadoraDescontos cDescontos = new CalculadoraDescontos();
        
        do{
            System.out.println("----------------------------------------------------------------");

            System.out.println("Deseja escolher um método de pagamento? [S]-Sim   [N]-Não");
            continuar = read.nextLine();

            switch (continuar) {
                case "S":
                    System.out.println("Escolha o método de pagamento.");
                    System.out.print("[1] - Parcelas       ");
                    System.out.println("[2] - Desconto");
                    metodo = read.nextLine();

                    switch (metodo) {
                        case "1":
                            cDescontos.Parcela();
                            break;
                        case "2":
                            cDescontos.Desconto();
                            break;
                        default:
                            System.out.println("Na próxima, insira um valor válido");
                            break;
                    }

                    /*if(metodo == "1"){
                        cDescontos.Parcela();
                    } else if(metodo == "2"){
                        cDescontos.Desconto();
                    } else{
                        System.out.println("Na próxima, insira um valor válido");
                    }*/
                    break;
                
                case "N":
                    System.out.println("Encerrando o programa.");
                    continuar = "N";
                    break;

                default:
                    System.out.println("Isto será considerado como 'N'");
                    continuar = "N";
                    break;
            }

            /*if (continuar == "S" || continuar == "s"){
                System.out.println("Escolha o método de pagamento.");
                System.out.print("[1] - Parcelas       ");
                System.out.println("[2] - Desconto");
                metodo = read.nextLine();

                if(metodo == "1"){
                    cDescontos.Parcela();
                } else if(metodo == "2"){
                    cDescontos.Desconto();
                } else{
                    System.out.println("Na próxima, insira um valor válido");
                }

            } else if (continuar == "N" || continuar == "n"){
                System.out.println("Encerrando o programa.");

            } else{
                System.out.println("Isto será considerado como 'N'");
            }*/
        }while(continuar.equalsIgnoreCase("S"));

        read.close();
    }

}
