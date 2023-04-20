package ExerciciosExtraForWhile;

import java.util.Scanner;
import java.lang.Math;

public class Exercicios {
    Scanner sc = new Scanner(System.in, "latin");

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

    public void populacao(){}

    public void populacao2(){}

    public void numMaior(){}

    public void divisivel(){}

    public void gerarNum(){}

    public void tabuada(){}

    public void potencia(){}

    public void fibonacci(){}

    public void fatorial(){}

    public void primo(){}
}
/*
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
 * Dica: se sua variável é texto, o tamanho dela está armazenado em:
 * texto.length()
 * Se caso o usuário digitar alguma coisa diferente do solicitado a pergunta
 * deve ser repetida.
 * 3. Supondo que a população de um país A seja da ordem de 80000 habitantes com
 * uma taxa anual de crescimento de 3% e que a população de B seja 200000
 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 * e escreva o número de anos necessários para que a população do país A
 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 * 4. Altere o programa anterior permitindo ao usuário informar as populações e
 * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
 * operação.
 * 5. Faça um programa que leia 8 números e informe o maior número.
 * 6. Faça um programa que imprima na tela todos os nº divisíveis por 3 menores
 * que são menores que mil(1000)
 * 7. Faça um programa que receba dois números inteiros e gere os números
 * inteiros que estão no intervalo compreendido por eles.
 * 8. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
 * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
 * deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 * 9. Faça um programa que peça dois números, base e expoente, calcule e mostre
 * o primeiro número elevado ao segundo número. Não utilize a função de potência
 * da linguagem.
 * 10. A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,...
 * Faça um programa capaz de gerar a série até o n−ésimo termo.
 * Sequência de Fibonacci com laços
 * 11. Faça um programa que calcule o fatorial de um número inteiro fornecido
 * pelo usuário. Ex.: 5!=5.4.3.2.1=120
 * Calcular fatorial com laços
 * 12. Faça um programa que peça um número inteiro e determine se ele é ou não
 * um número primo. Um número primo é aquele que é divisível somente por ele
 * mesmo e por 1.0
 */
/**
 * Exercicios
 */