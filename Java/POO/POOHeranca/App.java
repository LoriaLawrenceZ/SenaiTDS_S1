package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {

        Alunos a1 = new Alunos();
        Funcionarios f1 = new Funcionarios();
        Professores p1 = new Professores();

        a1.setNome("Lorenzo Oliveira");
        f1.setNome("Lídio Silva");
        p1.setNome("Diogo Takamura");

        f1.setSalario(1500);
        p1.setSalario(5000);

        p1.setMateria("LMR");
    }
}
