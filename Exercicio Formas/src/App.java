import geometria.Circulo;
import geometria.Quadrado;
import geometria.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio Formas");
        
        Quadrado quadrado = new Quadrado(20, "Preto");
        System.out.println(quadrado);
        System.out.println("A area de quadrado é " + quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(10, 10, "Escaleno");
        System.out.println(triangulo);
        System.out.println("A area do triangulo é " + triangulo.calcularArea());

        Circulo circulo = new Circulo(20);

        System.out.println(circulo);
        System.out.println("A área do Circulo é " + circulo.CalcularArea());
        System.out.println("A Circunferência do circulo é " + circulo.getCircunferencia());
    }
}
