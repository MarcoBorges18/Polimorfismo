package geometria;

public abstract class Formas {
    protected double altura;
    protected double base;
    
    public Formas(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Formas() {}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public abstract String toString();

    
}
