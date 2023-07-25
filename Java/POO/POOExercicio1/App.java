package POOExercicio1;

public class App{
    public static void main(String[] args) {
        Exercicio1 Exercicio1 = new Exercicio1();
    
        Exercicio1.setNome("Lorenzo");
        Exercicio1.setAltura(1.81);
        Exercicio1.setDiaNascimento(26);
        Exercicio1.setMesNascimento(04);
        Exercicio1.setAnoNascimento(2005);

        Exercicio1.Imprimir();
        Exercicio1.CalcularIdade();
    }
}
