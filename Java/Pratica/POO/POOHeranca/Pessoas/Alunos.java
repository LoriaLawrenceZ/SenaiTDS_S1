package POOHeranca.Pessoas;

public class Alunos extends Pessoas {
    //---------===== Subclasse =====---------//
    //(Herda da superclasse Pessoas)

    private int nMatricula;
    private String curso;
    private String turma;
    private double media;

    //Métodos
    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }  

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
    @Override
    public void setRg(String rg) {
        // TODO Auto-generated method stub
        this.rg =  "SP" + "numero";
    }
}
