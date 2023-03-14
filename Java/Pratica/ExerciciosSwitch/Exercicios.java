package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicios {
    Scanner in = new Scanner(System.in, "latin1");

    /* Exercício 1 */
    public void VogalConsoante() {
        String tipoLetra;

        System.out.println("Insira aqui uma única letra");
        String letra = in.next();

        switch (letra) {
            case "a":
                tipoLetra = "VOGAL!";
                break;
            case "e":
                tipoLetra = "VOGAL!";
                break;
            case "i":
                tipoLetra = "VOGAL!";
                break;
            case "o":
                tipoLetra = "VOGAL!";
                break;
            case "u":
                tipoLetra = "VOGAL!";
                break;
            default:
                tipoLetra = "CONSOANTE!";
        }

        System.out.println("A letra inserida (" + letra + ") é uma " + tipoLetra);
    }

    public void NumeroMes() {
        String mes = "";

        System.out.println("Insira um único número de 1 a 12");
        int numeroMes = in.nextInt();

        switch (numeroMes) {
            case 1:
                mes = "JANEIRO!";
                break;
            case 2:
                mes = "FEVEREIRO!";
                break;
            case 3:
                mes = "MARÇO!";
                break;
            case 4:
                mes = "ABRIL!";
                break;
            case 5:
                mes = "MAIO!";
                break;
            case 6:
                mes = "JUNHO!";
                break;
            case 7:
                mes = "JULHO!";
                break;
            case 8:
                mes = "AGOSTO!";
                break;
            case 9:
                mes = "SETEMBRO!";
                break;
            case 10:
                mes = "OUTUBRO!";
                break;
            case 11:
                mes = "NOVEMBRO!";
                break;
            case 12:
                mes = "DEZEMBRO!";
                break;
            default:
                System.out.println("O número inserido não corresponde com nenhum mês do ano.");
        }

        if(mes == ""){
            System.out.println("Insira um valor válido da próxima vez!");
        }
        else{
            System.out.println("O mês de número "+ numeroMes +" é "+ mes);
        }
    }
}
