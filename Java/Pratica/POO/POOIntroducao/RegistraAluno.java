package Java.Pratica.POO.POOIntroducao;

public class RegistraAluno {
    // Atributo da Classe //
    private static int contadorEstudante;

    // Declaração dos Atributos do Objeto //
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaCiencias;
    
    //--------=====Criação de Métodos SET=====--------//
    // Define ou altera o nome do estudante
    public void setNome(String temp) {
        nome = temp;
    }
    // Define ou altera o endereço do estudante
    public void setEndereco(String temp) {
        endereco = temp;
    }
    // Define ou altera o endereço do estudante
    public void setIdade(int temp) {
        idade = temp;
    }
    // Define ou altera o endereço do estudante
    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }
    // Define ou altera o endereço do estudante
    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }
    // Define ou altera o endereço do estudante
    public void setNotaCiencias(double temp) {
        notaCiencias = temp;
    }

    //--------=====Criação de Métodos GET=====--------//
    // Retorna o nome do estudante //
    public String getNome() {
        return nome;
    }

    // Retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }

    // Retorna idade do estudante
    public int getIdade() {
        return idade;
    }

    // Retorna a média do estudante
    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaCiencias) / 3;

        return resultado;
    }

    // Retorna a quantidade de estudantes cadastrados
    public static int getQauntidadeAlunos() {
        return contadorEstudante;
    }
}
