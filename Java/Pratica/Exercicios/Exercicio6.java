package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    Scanner in = new Scanner(System.in, "latin1");
    
    public void PesoIdeal(){
        System.out.println("Insira seu sexo\n[1]-Feminino [2]-Masculino");
        int sexo = in.nextInt();

        System.out.println("Insira sua altura (em centímetros)\n[Apenas números]");
        int altura = in.nextInt();

        if(sexo == 1){
            System.out.println("O seu peso ideal seria de "+ ((72.7 * altura) - 58) +" kg");
        }
        else{
            System.out.println("O seu peso ideal seria de "+ ((62.1 * altura) - 44.7) +" kg");
        }
    }
}
