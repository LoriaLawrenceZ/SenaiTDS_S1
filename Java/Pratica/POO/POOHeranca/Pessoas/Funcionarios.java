package POOHeranca.Pessoas;

public class Funcionarios extends Pessoas{
    //---------===== Subclasse =====---------//
    //(Herda da superclasse Pessoas)

    private int nIdentificacao;
    private double salario;
    private String periodo;

    //Métodos
    public int getnIdentificacao() {
        return nIdentificacao;
    }
    public void setnIdentificacao(int nIdentificacao) {
        this.nIdentificacao = nIdentificacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public void setRg(String rg) {
        // TODO Auto-generated method stub
        this.rg =  "SP" + "numero";
    }
}
