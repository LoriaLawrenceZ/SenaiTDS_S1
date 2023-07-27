package POORevisaoAgendamento.Horario;

import java.util.Scanner;

public class AgendaConsulta {
    Scanner sc = new Scanner(System.in, "latin1");
    // Atributes
    String horario;
    String data;
    String cliente;
    String veterinario;

    // Methods
    // Contructor
    public AgendaConsulta(String horario, String data, String cliente, String veterinario) {
        this.horario = horario;
        this.data = data;
        this.cliente = cliente;
        this.veterinario = veterinario;    
    }

    // Getters & Setters
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    // Own methods
}