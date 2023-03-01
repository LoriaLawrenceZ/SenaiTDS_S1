package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    Scanner in = new Scanner(System.in, "latin1");
    
    public void Validacao(){
        System.out.println("insira a sua senha.");
        String senha = in.next();

        if(senha == "1234"){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }
}
