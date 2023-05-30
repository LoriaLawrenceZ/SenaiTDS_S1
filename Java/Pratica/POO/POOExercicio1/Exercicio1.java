package POOExercicio1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio1{
    Scanner sc = new Scanner(System.in, "latin1");

    String nome;
    double altura;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //Printar as informações da pessoa
    public void Imprimir() {
        System.out.println("Nome: "+ nome +"\nAltura: "+ altura +"\nData Nascimento: "+ diaNascimento +"/"+ mesNascimento +"/"+ anoNascimento);
    }
    //Calcular a idade da pessoa
    public void CalcularIdade() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
    }
}
