package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    Scanner in = new Scanner(System.in, "latin1");
    
    public void DuziaMaca(){
        System.out.println("Caso compre menos que uma dúzia de maçãs, cada uma sairá por R$ 0,30\nCaso compre ao menos uma dúzia de maçãs, cada maçã saíra por R$ 0,25\nQuantas maçãs deseja comprar?");
        int quantidadeMaca = in.nextInt();

        if(quantidadeMaca >= 12){
            System.out.println("O valor a ser pago será de R$ "+ (quantidadeMaca * 0.25));
        }
        else{
            System.out.println("O valor a ser pago será de R$ "+ (quantidadeMaca * 0.30));
        }
    }
    
}
