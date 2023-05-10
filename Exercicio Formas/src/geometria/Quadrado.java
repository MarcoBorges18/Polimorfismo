package geometria;

public class Quadrado extends Formas{

    private String cor;

    public Quadrado(double base, String cor) {
        super(base, base);
        this.cor = cor;
    }

    public double calcularArea(){
        return base*altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Quadrado [Base =" + base + " Altura=" + altura + " Cor=" + cor + "]";
    }

}
