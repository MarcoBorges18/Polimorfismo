package geometria;

public class Triangulo extends Formas{

    private String tipo;

    public Triangulo(double altura, double base, String tipo) {
        super(altura, base);
        this.tipo = tipo;
    }

    public double calcularArea(){
        return (base * altura)/2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Trinagulo [Base =" + base + " Altura=" + altura + " Tipo=" + tipo + "]";
    }

    
    
}
