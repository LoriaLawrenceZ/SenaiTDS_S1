package POOInterface;

public class Quadrado implements FigurasGeometricas {
    //Assinou o "contrato" com a interface; Obrigatório declarar os métodos da classe FigurasGeometricas

    //Atributos  da classe Quadrado
    int lado;

    //Construtor com Parâmetro
    public Quadrado(int lado){
        this.lado = lado;
    }

    //Métodos importados de FigurasGeometricas
    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        int area = lado * lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        int perimetro = lado * 4;
        return perimetro;
    }
    
}
