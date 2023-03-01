package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    Scanner in = new Scanner(System.in, "latin1");

    public void Votar(){
        System.out.println("insira o seu ano de nascimento\n[Apenas números]");
        int anoNascimento = in.nextInt();

        if((2023 - anoNascimento) >= 16){
            System.out.println("Sim, você já pode votar");
        }
        else{
            System.out.println("Não, você ainda não pode votar.");
        }
    }
}
