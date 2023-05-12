package funcionario;

public class Vendedor extends Funcionario{

    private float comissao;
    private int numVendas, totalVendas;
    
    public Vendedor(String nome, float salario, int idade, float comissao, int numVendas, int totalVendas) {
        super(nome, salario, idade);
        this.comissao = comissao;
        this.numVendas = numVendas;
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularComissao() {
        if(numVendas < 12){
            setComissao(totalVendas * 0.05f);
        }else if(numVendas >= 20){
            setComissao(totalVendas * 0.10f);
        }else{
            comissao = totalVendas * ((int)((numVendas)/2) * 0.01f);
        }
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
        return "Vendedor [nome= " + nome + "idade= " + idade + "salario= "+ salario + "comissao= " + comissao + ", numVendas= " + numVendas + ", totalVendas= " + totalVendas + "]";
    }

    
    
}
