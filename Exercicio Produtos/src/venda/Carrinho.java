package venda;

import java.util.ArrayList;
import java.util.List;
import produto.Produto;

public class Carrinho {

    private List<Produto> produtos;
    private float total;
    
    public Carrinho() {
        produtos = new ArrayList<Produto>();
        this.total = 0f;
    }

    private void calcularVenda(){
        for (Produto p : produtos) {
            total += p.getPreco();
        }
    }

    public void vender(List<Produto> lista){
        this.produtos = lista;
        calcularVenda();
    }

    public void vender(Produto prod){
        produtos.add(prod);
        total += prod.getPreco();
    }

    @Override
    public String toString() {
        return "Carrinho [produtos=" + produtos + ", total=" + total + "]";
    }

    
    
}
