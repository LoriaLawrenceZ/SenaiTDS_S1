package POOHeranca.Pessoas;

//"abstract" proibe a criação de objetos desta classe
public abstract class Pessoas {
    //---------===== Superclasse =====---------//
    //(Fornece herança para as outras classes)
    
    //Atributos Genéricos (comuns a todas as)
    String nome;
    int idade;
    String  endereco;
    String cpf;

    //Métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
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
}
