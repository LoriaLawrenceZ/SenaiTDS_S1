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

        System.out.println("Insira a taxa de crescimento do país A. [0 - 100]");
        taxaAcresc = sc.nextInt();
        while (taxaAcresc <= 0) {
            System.out.println("Insira um valor válido.");
            taxaAcresc = sc.nextInt();
        }

        System.out.println("Insira a taxa de crescimento do país B. [0 - 100]");
        taxaBcresc = sc.nextInt();
        while (taxaBcresc <= 0) {
            System.out.println("Insira um valor válido.");
            taxaBcresc = sc.nextInt();
        }

        taxaAcresc = 1 + (taxaAcresc / 100);
        taxaBcresc = 1 + (taxaBcresc / 100);

        if (paisA < paisB && taxaAcresc > taxaBcresc) {
            while (paisA < paisB) {
                paisA *= taxaAcresc;
                paisB *= taxaBcresc;
                anos++;
            }
            
            System.out.println("Serão necessários ao menos "+ anos +" anos para que a população do país A ultrapasse ou iguale a do país B");
        }
        else if(paisA < paisB && taxaAcresc <= taxaBcresc){
            System.out.println("O país A nunca ultrapassará ou se igualará à população do aís B");
        }
        else if(paisA == paisB){
            System.out.println("Os países já tem populações igualadas");
        }
        else if(paisA > paisB && taxaAcresc < taxaBcresc){
            while (paisB < paisA) {
                paisA *= taxaAcresc;
                paisB *= taxaBcresc;
                anos++;
            }
            
            System.out.println("Serão necessários ao menos "+ anos +" anos para que a população do país B ultrapasse ou iguale a do país A");
        }
        else{
            System.out.println("O país A nunca ultrapassará ou se igualará à população do aís B");
        }

    }

    public void numMaior(){
        double nums[] = new double[8], maior = 0;

        System.out.println("Insira 8 valores para popular o vetor:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
            }
        }

        System.out.println("O maior número é: "+ maior);
    }

    public void divisivel(){
        int num[], d, j, iV = 0;
        for (int i = 1; i <= 1000; i++) {
            d = 0;
            j = 1;
            while(d < 3 && j < i){
                if(i % (i-j) == 0){
                    d++;
                }
                
                j++;

                if (d == 3) {
                    iV++;
                    d++;
                }
            }
        }

        num = new int[iV];
        
        iV = 0;
        for (int i = 1; i <= 1000; i++) {
            d = 0;
            j = 1;
            while(d < 3 && j < i){
                if(i % (i-j) == 0){
                    d++;
                }

                j++;

                if (d == 3) {
                    num[iV] = i;
                    iV++;
                    d++;
                }
            }
        }

        System.out.println("Os números que são divisíveis por 3 menores que são menores que mil(1000) são:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public void gerarNum(){
        int num1, num2, meio, conteudo[], iC = 0;

        System.out.println("Insira um número inteiro que represente o começo do intervalo numérico:");
        num1 = sc.nextInt();

        System.out.println("Insira um número inteiro que represente o final do intervalo numérico:");
        num2 = sc.nextInt();

        meio = num1 + 1;
        
        while (meio < num2) {
            iC++;
            meio++;
        }

        conteudo = new int[iC];
        
        iC = 0;
        meio = num1 + 1;
        while (meio < num2) {
            conteudo[iC] = meio;
            iC++;
            meio++;
        }

        System.out.println("Os números presentes no intervalo númerico de "+ num1 +" e "+ num2 +" é:");
        for (int i = 0; i < conteudo.length; i++) {
            System.out.println(conteudo[i]);
        }
    }

    public void tabuada(){
        int num;

        System.out.println("Insira o número que deseja ver a tabuada:");
        num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num +" X "+ (i + 1) +" = "+ (num * (i + 1)));
        }
    }

    public void potencia(){
        int num, potencia;

        System.out.println("Informe um valor:");
        num = sc.nextInt();

        System.out.println("Informe uma potência:");
        potencia = sc.nextInt();

        System.out.print("O resultado de "+ num +" elevado à "+ potencia +" é igual a: ");

        for (int i = 1; i < potencia; i++) {
            num *= potencia;
        }

        System.out.println(num);
    }

    public void fibonacci(){
        double fn = 1, fn_1 = 1, fn_2 = 0;
        int termo;

        System.out.println("Quantos termos da sequência de Fibonacci deseja ver?");
        termo = sc.nextInt();

        for (int i = 0; i < termo; i++) {
            System.out.println(fn +"; ");
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }

    public void fatorial(){
        int num, repeticao;

        System.out.println("Insira um valor para ser calculado seu fatorial.");
        num = sc. nextInt();
        repeticao = num;

        System.out.print("O fatorial de "+ num +" é: ");

        while (repeticao > 2) {
            num *= (repeticao - 1);
            repeticao--;
        }

        System.out.println(num);
    }

    public void primo(){
        int num, d = 0;

        System.out.println("Insira um valor para verificar se é primo ou não");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if(num % (num - i) == 0){
                d++;
            }
        }
        if(d > 2){
            System.out.println("O número informado não é primo.");
        }
        else{
            System.out.println("O número informado é primo.");
        }
    }
}
