package Java.Pratica.POO.POOIntroducao;

public class App {
    public static void main(String[] args) {
        //Criando um objeto referente da classe RegistraAluno()
        RegistraAluno aluno1 = new RegistraAluno();
        RegistraAluno aluno2 = new RegistraAluno();
        //Executando métodos da classe para o obj
        aluno1.setNome("Lorenzo Oliveira Zimbres");
        aluno1.setEndereco("Rua Foda Demais Oras, 123");
        aluno1.setIdade(18);
        aluno1.setNotaMatematica(10);
        aluno1.setNotaPortugues(7);
        aluno1.setNotaCiencias(8.5);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getEndereco());
        System.out.println(aluno1.getIdade());
        System.out.println(aluno1.getMedia());

        aluno2.setNome("Fernando Rheder Nascimento");
        aluno2.setEndereco("Rua Ruim Pouco Oras, 123");
        aluno2.setIdade(18);
        aluno2.setNotaMatematica(9);
        aluno2.setNotaPortugues(8);
        aluno2.setNotaCiencias(10);

        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getEndereco());
        System.out.println(aluno2.getIdade());
        System.out.println(aluno1.getMedia());
    }
}
