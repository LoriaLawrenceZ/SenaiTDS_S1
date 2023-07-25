package POOExercicio2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        //Armazena pessoas na Agenda
        for (int i = 0; i < 10; i++) {
            agenda.armazenaPessoa("Pessoa"+(i+1), 15+i, 1.5f+i/10f);
        }
        //Imprime os dados da Agenda
        for (int i = 0; i < 10; i++) {
            agenda.imprimeAgenda();
        }

        //Procurando pessoa pelo Nome
        System.out.println("Quem deseja procurar?");
        int posicaoPessoa = agenda.buscaPessoa(sc.next());

        if (posicaoPessoa != -1) {
            System.out.println("A pessoa está na "+ (posicaoPessoa+1) +"° posição");
        } else {
            System.out.println("Pessoa não encontrada na agenda.");
        }

        //IMprime os dados da Pessoa pelo Índice
        agenda.imprimePessoa(posicaoPessoa);
    }
}
