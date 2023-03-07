package Exercicios;

import java.util.Scanner;

public class Exercicios{
    Scanner in = new Scanner(System.in, "latin1");

    /*Exercício 1*/
    public void Compara(){
        System.out.println("Insira um primeiro número");
        double num1 = in.nextDouble();

        System.out.println("Insira um segundo número");
        double num2 = in.nextDouble();

        if(num1 > num2){
            System.out.println("O maior número é o primeiro número, "+ num1);
        }
        else if(num1 < num2){
            System.out.println("O maior número é o segundo número, "+ num2);
        }
        else{
            System.out.println("Os números inseridos são de mesmo valor");
        }
    }

    /*Exercício 2*/
    public void Votar(){
        System.out.println("insira o seu ano de nascimento\n[Apenas números]");
        int anoNascimento = in.nextInt();

        if((2023 - anoNascimento) >= 16){
            System.out.println("Sim, você já pode votar");
        }
        else{
            System.out.println("Não, você ainda não pode votar.");
        }
    }

    /*Exercício 3*/
    public void Validacao(){
        System.out.println("insira a sua senha.");
        String senha = in.next();

        if(senha == "1234"){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
    }

    /*Exercício 4*/
    public void DuziaMaca(){
        System.out.println("Caso compre menos que uma dúzia de maçãs, cada uma sairá por R$ 0,30\nCaso compre ao menos uma dúzia de maçãs, cada maçã saíra por R$ 0,25\nQuantas maçãs deseja comprar?");
        int quantidadeMaca = in.nextInt();

        if(quantidadeMaca >= 12){
            System.out.println("O valor a ser pago será de R$ "+ (quantidadeMaca * 0.25));
        }
        else{
            System.out.println("O valor a ser pago será de R$ "+ (quantidadeMaca * 0.30));
        }
    }

    /*Exercício 5*/
    public void TresValores(){
        System.out.println("Insira um valor");
        double num1 = in.nextDouble();

        System.out.println("Insira um segundo valor");
        double num2 = in.nextDouble();

        System.out.println("Insira um terceiro valor");
        double num3 = in.nextDouble();

        if(num1 >= num2 & num2 >= num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num3 +", "+ num2 +", "+ num1);
        }
        else if(num1 >= num3 & num3 >= num2){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num2 +", "+ num3 +", "+ num1);
        }
        else if(num2 >= num1 & num1 >= num3){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num3 +", "+ num1 +", "+ num2);
        }
        else if(num2 >= num3 & num3 >= num1){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num1 +", "+ num3 +", "+ num2);
        }
        else if(num3 >= num2 & num2 >= num1){
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num1 +", "+ num2 +", "+ num3);
        }
        else{
            System.out.println("Os valores dados escritos em ordem crescente será:\n"+ num2 +", "+ num1 +", "+ num3);
        }
    }

    /*Exercício 6*/
    public void PesoIdeal(){
        System.out.println("Insira seu sexo\n[1]-Feminino [2]-Masculino");
        int sexo = in.nextInt();

        System.out.println("Insira sua altura (em metros)\n[Apenas números]");
        double altura = in.nextDouble();

        if(sexo == 1){
            System.out.println("O seu peso ideal seria de "+ ((72.7 * altura) - 58) +" kg");
        }
        else{
            System.out.println("O seu peso ideal seria de "+ ((62.1 * altura) - 44.7) +" kg");
        }
    }

    /*Exercício 7*/
    public void NotaFrequencia(){
        System.out.println("Insira sua Primeira Nota. [0 - 10] \n[Apenas Números]");
        double nota1 = in.nextDouble();

        System.out.println("Insira sua Segunda Nota. [0 - 10]\n[Apenas Números]");
        double nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("\nInforme a frequênca do aluno (Porcentagem).\n [Apenas Números]");
        int frequenciaAluno = in.nextInt();

        if(media >= 5 & frequenciaAluno >= 75){
            System.out.println("O aluno foi APROVADO por NOTA\nO aluno foi APROVADO por FREQUÊNCIA\nPortanto o aluno está APROVADO");
        }
        else if(media >= 5 & frequenciaAluno < 75){
            System.out.println("O aluno foi APROVADO por NOTA\nO aluno foi REPROVADO por FREQUÊNCIA\nPortanto o aluno está REPROVADO");
        }
        else if(media < 5 & frequenciaAluno >= 75){
            System.out.println("O aluno foi REPROVADO por NOTA\nO aluno foi APROVADO por FREQUÊNCIA\nPortanto o aluno está REPROVADO");
        }
        else{
            System.out.println("O aluno foi REPROVADO por NOTA\nO aluno foi REPROVADO por FREQUÊNCIA\nPortanto o aluno está REPROVADO");
        }
    }

    /*Exercício Extra 1*/
    public void ImparOuPar(){
        System.out.println("Insira um valor inteiro. [Número]");

        int num1 = in.nextInt();

        if((num1 % 2) == 0){
            System.out.println("O número inserido é PAR");
        }
        else{
            System.out.println("O número inserido é ÍMPAR");
        }
    }

    /*Exercício Extra 2*/
    public void PassaReprova(){
        System.out.println("Insira a nota do aluno.\n[Apenas números] [0 - 10]");
        double nota = in.nextDouble();

        if(nota >= 7){
            System.out.println("Aluno foi APROVADO");
        }
        else if(nota >=5 && nota < 7){
            System.out.println("O aluno tem direito a fazer uma prova de recuperação");
        }
        else{
            System.out.println("O aluno foi REPROVADO");
        }
    }

    /*Exercício Extra 3*/
    public void VogalConsoante(){
        System.out.println("Insira um único caractere para que seja verificado se é uma consoante ou uma vogal");
        String letra = in.next();

        if(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u")){
            System.out.println("O caractere inserido é uma VOGAL");
        }
        else{
            System.out.println("O caractere inserido é uma CONSOANTE");
        }
    }

    /*Exercício Extra 4 (Difícil)*/
    public void SalarioColaborador(){
        System.out.println("Insira o salário do colaborador para que possa ser feito o cálculo do reajuste.\n[Apenas números]");
        double salario = in.nextDouble();

        if(salario <= 1280){
            System.out.println("Salário antes do reajuste: R$ "+ salario +"\nPercentual de aumento aplicado: 20%\nValor do aumento: "+ (salario * 0.2) +"\nSalário pós reajuste: R$ "+ (salario * 1.2));
        }
        else if(salario > 1280 & salario <= 1700){
            System.out.println("Salário antes do reajuste: R$ "+ salario +"\nPercentual de aumento aplicado: 15%\nValor do aumento: "+ (salario * 0.15) +"\nSalário pós reajuste: R$ "+ (salario * 1.15));
        }
        else if(salario > 1700 & salario <= 2500){
            System.out.println("Salário antes do reajuste: R$ "+ salario +"\nPercentual de aumento aplicado: 10%\nValor do aumento: "+ (salario * 0.1) +"\nSalário pós reajuste: R$ "+ (salario * 1.1));
        }
        else{
            System.out.println("Salário antes do reajuste: R$ "+ salario +"\nPercentual de aumento aplicado: 5%\nValor do aumento: "+ (salario * 0.05) +"\nSalário pós reajuste: R$ "+ (salario * 1.05));
        }
    }

    /*Exercício Extra 5 (Difícil)*/
    public void FolhaPagamento(){
        System.out.println("Informe o valor da hora trabalhada.\n[Apenas números]");
        double valorHora = in.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês.\n[Apenas números INTEIROS]");
        int horasTrabalhadas = in.nextInt();

        if( (valorHora * horasTrabalhadas) <= 900 ){
            System.out.println("\nValor da hora é R$"+valorHora+" e a quantidade de horas trabalhadas é "+horasTrabalhadas+"\n\nSalário bruto ("+valorHora+" * "+horasTrabalhadas+"): R$ "+ (valorHora * horasTrabalhadas) +"\n\n( -- ) IR (ISENTO)         : R$ 00,00\n\n( -- ) INSS ( 10% )      : R$ "+((valorHora * horasTrabalhadas) * 0.1)+"\n\nFGTS ( 11% )             : RS "+ ((valorHora * horasTrabalhadas) * 0.11) +"\n\nTotal de descontos       : R$ "+ ((valorHora * horasTrabalhadas) * 0.1) +"\n\nSalário líquido          : R$ "+ (valorHora * horasTrabalhadas) * 0.9);
        }
        else if( (valorHora * horasTrabalhadas) <= 1500 ){
            System.out.println("\nValor da hora é R$"+valorHora+" e a quantidade de horas trabalhadas é "+horasTrabalhadas+"\n\nSalário bruto ("+valorHora+" * "+horasTrabalhadas+"): R$ "+ (valorHora * horasTrabalhadas) +"\n\n( -- ) IR ( 5% )         : R$ "+ ((valorHora * horasTrabalhadas) * 0.05) +"\n\n( -- ) INSS ( 10% )      : R$ "+((valorHora * horasTrabalhadas) * 0.1)+"\n\nFGTS ( 11% )             : RS "+ ((valorHora * horasTrabalhadas) * 0.11) +"\n\nTotal de descontos       : R$ "+ ((valorHora * horasTrabalhadas) * 0.15) +"\n\nSalário líquido          : R$ "+ (valorHora * horasTrabalhadas) * 0.85);
        }
        else if( (valorHora * horasTrabalhadas) <= 2500 ){
            System.out.println("\nValor da hora é R$"+valorHora+" e a quantidade de horas trabalhadas é "+horasTrabalhadas+"\n\nSalário bruto ("+valorHora+" * "+horasTrabalhadas+"): R$ "+ (valorHora * horasTrabalhadas) +"\n\n( -- ) IR ( 10% )         : R$ "+ ((valorHora * horasTrabalhadas) * 0.1) +"\n\n( -- ) INSS ( 10% )      : R$ "+((valorHora * horasTrabalhadas) * 0.1)+"\n\nFGTS ( 11% )             : RS "+ ((valorHora * horasTrabalhadas) * 0.11) +"\n\nTotal de descontos       : R$ "+ ((valorHora * horasTrabalhadas) * 0.2) +"\n\nSalário líquido          : R$ "+ (valorHora * horasTrabalhadas) * 0.8);
        }
        else{
            System.out.println("\nValor da hora é R$"+valorHora+" e a quantidade de horas trabalhadas é "+horasTrabalhadas+"\n\nSalário bruto ("+valorHora+" * "+horasTrabalhadas+"): R$ "+ (valorHora * horasTrabalhadas) +"\n\n( -- ) IR ( 20% )         : R$ "+ ((valorHora * horasTrabalhadas) * 0.2) +"\n\n( -- ) INSS ( 10% )      : R$ "+((valorHora * horasTrabalhadas) * 0.1)+"\n\nFGTS ( 11% )             : RS "+ ((valorHora * horasTrabalhadas) * 0.11) +"\n\nTotal de descontos       : R$ "+ ((valorHora * horasTrabalhadas) * 0.3) +"\n\nSalário líquido          : R$ "+ (valorHora * horasTrabalhadas) * 0.7);
        }
    }
}