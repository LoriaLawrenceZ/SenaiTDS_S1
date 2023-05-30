package POOExercicios;

import javax.swing.JOptionPane;

public class App{
    Exercicio1 Exercicio1 = new Exercicio1();

    String valor = JOptionPane.showInputDialog("Informe a idade");
    Exercicio1.setNome(valor);
}
