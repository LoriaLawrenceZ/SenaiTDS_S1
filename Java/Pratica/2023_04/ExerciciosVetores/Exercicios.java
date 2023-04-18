package ExerciciosVetores;

import java.util.Scanner;
import java.lang.Math;

public class Exercicios {
    Scanner in = new Scanner(System.in, "latin1");

    public void cincoInteiros() {
        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Insira um valor. [Número Inteiro]");
            valores[i] = in.nextInt();
        }

        System.out.println("Listando os números pela ordem que foram informados");

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "; ");
        }
    }

    public void dezInverso() {
        double[] valores = new double[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Insira um valor. [Número Inteiro]");
            valores[i] = in.nextInt();
        }

        System.out.println("Listando os números pela ordem inversa ao que foram informados:");

        for (int i = valores.length; i > -1; i--) {
            System.out.print(valores[i] + "; ");
        }

    }

    public void media() {
        double notas[] = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a " + i + "° nota\n[0 - 10]");
            notas[i] = in.nextDouble();
        }

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("Notas do aluno:\n" + notas[0] + "\n" + notas[1] + "\n" + notas[2] + "\n" + notas[3]
                + "\nMédia do Aluno: " + media);
    }

    public void consoante() {
        int j = 0, quant = 0;
        char consoante[] = new char[10];
        String palavra;

        System.out.println("Insira uma palavra de no máximo 10 letras");
        palavra = in.next();

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u') {
                consoante[j] = palavra.charAt(i);
                j++;
            }
        }

        j = 0;
        while (j < consoante.length) {
            if (consoante[j] != 0) {
                quant++;
            }
            j++;
        }

        System.out.println("Foram inseridas " + quant + " consoantes.\nForam utilizadas:");

        j = 0;
        while (consoante[j] != 0) {
            System.out.print(consoante[j] + "; ");
            j++;
        }
    }

    public void imPar(){
        int ii = 0, ip = 0, num[] = new int[20], impar[] = new int[20], par[] = new int[20];

        System.out.println("Insira valores.\n[20 valores]");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            int decidir;
            decidir = num[i]%2;
            if (decidir == 0) {
                par[ip] = num[i];
                ip++;
            } else {
                impar[ii] = num[i];
                ii++;
            }
        }

        System.out.println("Resultados:");
        
        System.out.println("Números:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +"; ");
        }

        System.out.println("\nPares: ");
        ip = 0;
        while (par[ip] != 0) {
            System.out.print(par[ip] +"; ");
            ip++;
        }

        System.out.println("\nÍmpares: ");
        ii = 0;
        while (impar[ii] != 0) {
            System.out.print(impar[ii] +"; ");
            ii++;
        }
    }

    public void mediaAlunos(){
        double notas, medias[] = new double[10];
        int j, quant = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno "+ (i+1) +":");
            j = 0;
            notas = 0;
            while (j < 4) {
                System.out.println("Insira a "+ (j+1) +" nota:");
                notas += in.nextDouble();
                j++;
            }
            medias[i] = notas/4;
        }

        for (int i = 0; i < medias.length; i++) {
            if (medias[i] >= 7) {
                quant++;
            }
        }

        System.out.println("Quantidade de alunos acima da média: "+ quant);
    }

    public void operacoes(){
        int num[] = new int[5], soma = 0, multiplicacao = 1;

        System.out.println("Insira valores para o vetor.\n[Inteiros]");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
            soma += num[i];
            multiplicacao *= num[i];
        }

        System.out.println("Números:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("Soma dos números: "+ soma +"\nMultiplicação dos números: "+ multiplicacao);
    }

    public void idadeAltura(){
        double idade[] = new double[5], altura[] = new double[5];

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Pessoa "+ i +":");

            System.out.println("Altura:");
            altura[i] = in.nextDouble();

            System.out.println("Idade:");
            idade[i] = in.nextDouble();
        }

        System.out.println("Informações na ordem inversa de inserção:");
        for (int i = altura.length; i > 0; i--) {
            System.out.println("Pessoa "+ i +":\nAltura: "+ altura[i] +"\nIdade: "+ idade[i]);
        }
    }

    public void somQua(){
        int vetorA[] = new int[10], soma = 0;

        System.out.println("Insira valores para o vetor.\n[Inteiros]");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
            soma += Math.pow(vetorA[i], 2);
        }

        System.out.println("A soma total dos quadrados dos elementos do vetor é: "+ soma);
    }
}
