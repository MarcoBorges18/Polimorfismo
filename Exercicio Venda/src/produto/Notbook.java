package produto;

public class Notbook extends Produto{
    
    private String processador;
    private int memoria;
    
    public Notbook(String nome, float preco, String marca, String processador, int memoria) {
        super(nome, preco, marca);
        this.processador = processador;
        this.memoria = memoria;
    }

    @Override
    public void calcularDesconto() {
        preco -= 100;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}
