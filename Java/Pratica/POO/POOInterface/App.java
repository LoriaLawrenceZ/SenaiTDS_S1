package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(8);
        Retangulo retangulo = new Retangulo(5, 10);
        Trapezio trapezio1 = new Trapezio(5, 8, 7, 7);
        Trapezio trapezio2 = new Trapezio(20, 10, 16, 14, 14);

    
        System.out.println("-> "+ quadrado.getNomeFigura() +"\n     Area: "+ quadrado.getArea() +"\n     Perímetro: "+ quadrado.getPerimetro());

        System.out.println("-> "+ retangulo.getNomeFigura() +"\n     Area: "+ retangulo.getArea() +"\n     Perímetro: "+ retangulo.getPerimetro());

        System.out.println("-> "+ trapezio1.getNomeFigura() +" 1\n     Area: "+ trapezio1.getArea() +"\n     Perímetro: "+ trapezio1.getPerimetro());

        System.out.println("-> "+ trapezio2.getNomeFigura() +" 2\n     Area: "+ trapezio2.getArea() +"\n     Perímetro: "+ trapezio2.getPerimetro());
    }                                                                                                                                                                                                                                                                                                                          

}
