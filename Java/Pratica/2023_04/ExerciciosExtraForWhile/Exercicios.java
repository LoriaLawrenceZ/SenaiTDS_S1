package ExerciciosExtraForWhile;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in, "latin1");

    public void userSenha(){
        String user, senha;

        System.out.println("Insira seu novo usuário:");
        user = sc.next();

        System.out.println("Insira sua nova senha:");
        senha = sc.next();

        while (senha.matches(".*"+ user +".*")) {
            System.out.println("Senha não pode ser, ou conter seu usuário.\nInsira uma senha válida:");
            senha = sc.next();
        }
    }

    public void dados(){
        String nome, sexo, estCivil;
        int idade;
        double salario;

        System.out.println("Insira seu Nome:");
        nome = sc.next();
        while (nome.length() < 3) {
            System.out.println("É necessário informar um nome com ao menos 3 caracteres.");
            nome = sc.next();
        }

        System.out.println("Insira sua Idade:");
        idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Insira um valor válida.");
            idade = sc.nextInt();
        }

        System.out.println("Insira seu Salário:");
        salario = sc.nextDouble();
        while (salario < 0) {
            System.out.println("Insira um valor maior que 0.");
            salario = sc.nextDouble();
        }

        System.out.println("Insira seu Sexo:\n[M]asculino - [F]eminino");
        sexo = sc.next();
        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            System.out.println("Insira uma das duas opções.");
            sexo = sc.next();
        }

        System.out.println("Insira seu Estado Civil:\n[S]olteiro(a)\n[C]asado\n[V]iúvo(a)\n[D]ivorciado");
        estCivil = sc.next();
        while (!estCivil.equalsIgnoreCase("S") && !estCivil.equalsIgnoreCase("C") && !estCivil.equalsIgnoreCase("v") && !estCivil.equalsIgnoreCase("D")) {
            System.out.println("Insira uma das quatro opções.");
            estCivil = sc.next();
        }
    }

    public void populacao(){
        int paisA = 80000, paisB = 200000, anos = 0;
        double taxaAcresc = 1.3, taxaBcresc = 1.15;

        while (paisA < paisB) {
            paisA *= taxaAcresc;
            paisB *= taxaBcresc;
            anos++;
        }

        System.out.println("Serão necessários ao menos "+ anos +" anos para que a população do país A ultrapasse ou iguale a do país B");
    }

    public void populacao2(){
        int paisA, paisB, anos = 0;
        double taxaAcresc, taxaBcresc;

        System.out.println("Insira a população de um país A");
        paisA = sc.nextInt();
        while (paisA < 0) {
            System.out.println("Insira um valor válido.");
            paisA = sc.nextInt();
        }

        System.out.println("Insira a população de um país B");
        paisB = sc.nextInt();
        while (paisB < 0) {
            System.out.println("Insira um valor válido.");
            paisB = sc.nextInt();
        }

        System.out.println("Insira a taxa de crescimento do país A");
        taxaAcresc = sc.nextInt();
        while (taxaAcresc <= 0) {
            System.out.println("Insira um valor válido.");
            taxaAcresc = sc.nextInt();
        }

        System.out.println("Insira a taxa de crescimento do país B");
        taxaBcresc = sc.nextInt();
        while (taxaBcresc <= 0) {
            System.out.println("Insira um valor válido.");
            taxaBcresc = sc.nextInt();
        }

        if (paisA < paisB) {
            while (paisA < paisB) {
                paisA *= taxaAcresc;
                paisB *= taxaBcresc;
                anos++;
            }
            
            System.out.println("Serão necessários ao menos "+ anos +" anos para que a população do país A ultrapasse ou iguale a do país B");
        }
        else if(paisA == paisB){
            System.out.println("Os países já tem populações igualadas");
        }
        else {
            while (paisB < paisA) {
                paisA *= taxaAcresc;
                paisB *= taxaBcresc;
                anos++;
            }
            
            System.out.println("Serão necessários ao menos "+ anos +" anos para que a população do país B ultrapasse ou iguale a do país A");
        }

    }

    public void numMaior(){

    }

    public void divisivel(){}

    public void gerarNum(){}

    public void tabuada(){}

    public void potencia(){}

    public void fibonacci(){}

    public void fatorial(){}

    public void primo(){}
}
