package POOHeranca.Pessoas;

public class Alunos extends Pessoas {
    //---------===== Subclasse =====---------//
    //(Herda da superclasse Pessoas)

    private int nMatricula;
    private String curso;
    private double media;
    private String turma;

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

    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }  
}
