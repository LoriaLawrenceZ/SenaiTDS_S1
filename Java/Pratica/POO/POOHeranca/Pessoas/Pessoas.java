package POOHeranca.Pessoas;

public class Pessoas {
    //---------===== Superclasse =====---------//
    //(Fornece herança para as outras classes)
    
    //Atributos Genéricos (comuns a todas as)
    String nome;
    String  endereco;
    String cpf;
    int idade;

    //Métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
