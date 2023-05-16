package POOHeranca.Pessoas;

public class Professores extends Funcionarios{
    //---------===== Subclasse =====---------//
    //(Herda da superclasse Pessoas)

    private String materia;

    //Métodos
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
}