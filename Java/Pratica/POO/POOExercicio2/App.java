package POOExercicio2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //Vetor de objetos
        Agenda obj[] = new Agenda[10]; //Vetor de objetos (10 itens)

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Agenda(); //Construindo o objeto

            obj[i].setNome(JOptionPane.showInputDialog("Nome: "));
            obj[i].setIdade(JOptionPane.showInputDialog("Idade: "));
            obj[i].setAltura(JOptionPane.showInputDialog("Altura: "));
        }
    }
}
