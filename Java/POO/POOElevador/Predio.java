package POOElevador;

public class Predio {
    int andarAtual = 0;
    int andarTotal = 0;
    int capacidadeElevador = 0;
    int pessoasPresentes = 0;

    public Predio(int andarTotal, int capacidadeElevador){
        this.andarTotal = andarTotal;
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void AdicionaPessoa(){
        if (pessoasPresentes < capacidadeElevador) {
            pessoasPresentes++;
            System.out.println("Agora há "+ pessoasPresentes +" pessoas no elevador");
        }
        else{
            System.out.println("O elevador está cheio!");
        }
    }

    public void RemovePessoa(){
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Agora há "+ pessoasPresentes +" pessoas no elevador");
        }
        else{
            System.out.println("O elevador está vazio!");
        }
    }

    public void SubirAndar(){
        if(andarAtual < andarTotal){
            andarAtual++;
            System.out.println("Agora você está no "+ andarAtual +"° andar");
        }
        else{
            System.out.println("VocÊ já está no último andar!");
        }
    }

    public void DescerAndar(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Agora você está no "+ andarAtual +"° andar");
        }
        else{
            System.out.println("VocÊ já está no térreo!");
        }
    }
}
