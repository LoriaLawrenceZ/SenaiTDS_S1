package POOExercicio2;

public class Agenda {
    private Pessoa[] pessoas;
    private int quantidadePessoas;

    public Agenda() {
        pessoas = new Pessoa[10];
        quantidadePessoas = 0;
    }

    public void armazenaPessoa(String nome, int idade, float altura) {
        if (quantidadePessoas < 10) {
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas[quantidadePessoas] = pessoa;
            quantidadePessoas++;
            System.out.println("Pessoa adicionada à agenda.");
        } else {
            System.out.println("A agenda está cheia. Não é possível adicionar mais pessoas.");
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < quantidadePessoas; i++) {
            if (pessoas[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 caso a pessoa não seja encontrada na agenda
    }

    public void imprimeAgenda() {
        if (quantidadePessoas == 0) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Agenda:");
            for (int i = 0; i < quantidadePessoas; i++) {
                System.out.println("\n---------\nPosição " + (i+1) + ": " + pessoas[i].DadosPessoa());
            }
        }
    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < quantidadePessoas) {
            System.out.println("Pessoa na posição " + index + ": " + pessoas[index].toString());
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
