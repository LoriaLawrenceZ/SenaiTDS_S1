package CalculadoraDeDescontos;

import java.util.Scanner;

//Classe calculadora de descontos
public class CalculadoraDescontos {
    Scanner read = new Scanner(System.in);

    //Criando método de parcela
    public void Parcela(){
        System.out.println("=================================================");
        double precoProduto, quantidadeParcelas, valorParcelas;
        
        System.out.println("Qual o preço do produto? [Apenas números]");
        precoProduto = read.nextDouble();
        read.nextLine();

        System.out.println("Em quantas parcelas deseja fazer? [Apenas números] [1 a 10]");
        quantidadeParcelas = read.nextDouble();
        read.nextLine();

        valorParcelas = precoProduto/quantidadeParcelas;

        System.out.println("Foi escolhido pagar o produto em "+quantidadeParcelas+" parcelas, sendo cada uma delas a "+valorParcelas+" reais");

        read.close();
    }
    
    //Criando método de desconto
    public void Desconto(){
        System.out.println("=================================================");
        double precoProduto, percentualDesconto, desconto;
    
        System.out.println("Qual o preço do produto? [Apenas números]");
        precoProduto = read.nextDouble();
        read.nextLine();
    
        System.out.println("Qual a porcentagem de desconto? [Apenas números]");
        percentualDesconto = read.nextDouble();
        read.nextLine();
    
        desconto = precoProduto * (percentualDesconto / 100);
    
        System.out.println("O valor a ser pago será de " + (precoProduto - desconto) + " reais, com um desconto de " + percentualDesconto + "% de desconto");
        
        read.close();
    }
}
