package ExemploVetores;

public class Vetores {
    //Criando método
    public void exemplo1(){
        //Criando um Vetor com 4 elementos (já os declarando)
        double[] valores = new double[]{10.5 , 20.7 , 30.6 , 40.4};

        System.out.println("1º Posição - Índice[0]: "+ valores[0] +"\n2º Posição - Índice[1]: "+ valores[1] +"\n3º Posição - Índice[2]: "+ valores[2] +"\n4º Posição - Índice[3]: "+ valores[3]);

        //Mudando valores de uma posição definida
        valores[0] = 15.6; //Mudando o valor do Índice[0]
        System.out.println("Após a mudaça de valor\n1º Posição - Índice[0]: "+ valores[0]);
    }

    public void exemplo2(){
        //Criando um Vetor com 6 elementos (sem definir valor aos elementos)
        /*
        Outra forma de declaração
        int novoValores[] = new int[5];
        */
        int[] novoValores = new int[5];
        novoValores[0] = 10;
        novoValores[1] = 20;
        novoValores[2] = 35;
        novoValores[3] = 67;
        novoValores[4] = 98;
        
        System.out.println("O vetor é : posição [0] = "+ novoValores[0]);
        System.out.println("O vetor é : posição [1] = "+ novoValores[1]);
        System.out.println("O vetor é : posição [2] = "+ novoValores[2]);
        System.out.println("O vetor é : posição [3] = "+ novoValores[3]);
        System.out.println("O vetor é : posição [4] = "+ novoValores[4]);
    }
}
