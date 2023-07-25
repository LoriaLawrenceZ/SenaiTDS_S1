package POOInterface;

//Somente MODELO para outras classes
public interface FigurasGeometricas {
    
    //Não pode instanciar objetos desta classe
    //Métodos abstratos por padrão/default
    public String getNomeFigura();
    public double getArea();
    public double getPerimetro();
}