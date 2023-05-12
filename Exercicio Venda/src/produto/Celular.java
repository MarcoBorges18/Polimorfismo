package produto;

public class Celular extends Produto{
    
    private int numero;
    private String modelo;

    public Celular(String nome, float preco, String marca, int numero, String modelo) {
        super(nome, preco, marca);
        this.numero = numero;
        this.modelo = modelo;
    }

     @Override
    public void calcularDesconto() {
        
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
