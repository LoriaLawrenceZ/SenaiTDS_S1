package POORevisaoAgendamento;

import java.util.Scanner;

import javax.swing.JOptionPane;

import POOExercicio2.Agenda;
import POORevisaoAgendamento.Horario.AgendaConsulta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin1");
        // Atributes
        String horario;
        String data;
        String cliente;
        String veterinario;

        AgendaConsulta agendaConsulta;
        AgendaConsulta agenda[] = new AgendaConsulta[100];

        String escolha = "";
        int i = 0;

        do {
            System.out.println("\n------------------------------------------------------------------------------------\n[1] - Agendar | [S] - Sair");
            escolha = sc.next().toLowerCase();

            switch (escolha) {
                case "1":
                    System.out.println("Qual dia deseja marcar a consulta?\n[xx/xx]");
                    data = sc.next();
                    while (agenda.getData) {
                        System.out.println("Data já escolhido\nInsira uma nova data");
                        data = sc.next();
                    }

                    System.out.println("Qual hora deseja marcar a consulta?\n[xx:xx]");
                    horario = sc.next();

                    System.out.println("Qual cliente?");
                    cliente = sc.next();

                    System.out.println("Qual veterinário?");
                    veterinario = sc.next();

                    agenda[i] = new AgendaConsulta(horario, data, cliente, veterinario);

                    for (int j = 0; j < agenda.length; j++) {
                        System.out.println(agenda[j].getData());
                        System.out.println(agenda[j].getHorario());
                        System.out.println(agenda[j].getCliente());
                        System.out.println(agenda[j].getVeterinario());
                    }

                    break;
                case "s":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "";
                    break;
            }

            i++;
        } while (escolha != "N");


        sc.close();
    }
}
