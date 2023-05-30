package POOInterface;

public class Retangulo implements FigurasGeometricas {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }   
}
