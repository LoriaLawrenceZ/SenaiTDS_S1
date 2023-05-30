package POOInterface;

public class Trapezio implements FigurasGeometricas {
    double baseMaior = 10;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2; 
    }
    public Trapezio(double baseMenor, double altura, double lado1, double lado2) {
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2; 
    }

    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return lado1 + lado2 + baseMaior + baseMenor;
    }

    
}
