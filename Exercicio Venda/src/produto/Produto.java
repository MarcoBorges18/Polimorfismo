package produto;

public abstract class Produto {

    protected String nome;
    protected float preco;
    protected String marca;
    
    public Produto(String nome, float preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }
        
    public abstract void calcularDesconto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

}
