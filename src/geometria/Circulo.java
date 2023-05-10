package geometria;

public class Circulo extends Formas {
    protected float circunferencia;

    public Circulo(float altura) {
        super(altura, altura);
        CalcularCircunferencia();
    }

    public float CalcularArea() {
        return (float) (3.14f * base * altura);
    }

    public void CalcularCircunferencia() {
        circunferencia = (float) ((2 * 3.14f)  * altura);
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public String toString() {
        return "Trinagulo [Base =" + base + " Altura=" + altura + " Circunferência=" + circunferencia + "]";
    }
}