package Cadastro;

public class Animais {
    //Attributes
    String proprietario;
    String nome;
    String especie;
    String porte;
    double peso;
    
    //Methods
    //Default Constructor
    public Animais(){}
    //New Constructor
    public Animais(String proprietario, String nome, String especie, String porte, double peso){
        this.proprietario = proprietario;
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.peso = peso;
    }

    //Getters & Setters
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Own Methods
}
