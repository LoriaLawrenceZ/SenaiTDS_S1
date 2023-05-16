package Operadores;
import java.util.Scanner;

public class NotaFrequencia {
    Scanner in = new Scanner(System.in, "latin1");

    public void calcular(){
        
        /*NOTA*/

        System.out.println("Insira sua Primeira Nota. \n[Apenas Números]");
        int nota1 = in.nextInt();

        System.out.println("Insira sua Segunda Nota. \n[Apenas Números]");
        int nota2 = in.nextInt();

        /*Operação Aritmética*/
        double mediaAluno = (nota1 + nota2) / 2;
        /*
        Operações de Atribuição
        mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        */

        System.out.println("A média do aluno é :\n  "+ mediaAluno +"\n");

        /*Operação Relacional*/
        boolean mediaAprovada = mediaAluno >= 50;

        if(mediaAprovada){
            System.out.println("O aluno foi APROVADO por nota");
        }
        else{
            System.out.println("O aluno foi REPROVADO por nota");
        }


        /*FREQUÊNCIA*/
        System.out.println("\nInforme a frequênca do aluno (Porcentagem).\n [Apenas Números]");
        int frequenciaAluno = in.nextInt();

        boolean frequenciaAprovada = frequenciaAluno >= 75;

        if(frequenciaAprovada){
            System.out.println("\nO aluno foi APROVADO por frequência");
        }
        else{
            System.out.println("\nO aluno foi REPROVADO por frequência");
        }


        /*APROVAÇÃO*/
        if(mediaAprovada && frequenciaAprovada){
            System.out.println("\nO aluno foi APROVADO");
        }
        else{
            System.out.println("\nO aluno foi REPROVADO");
        }
    }
}
