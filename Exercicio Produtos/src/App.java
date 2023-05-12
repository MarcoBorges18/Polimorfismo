import java.util.ArrayList;
import java.util.List;

import produto.Livro;
import produto.Mouse;
import produto.Produto;
import venda.Carrinho;

public class App {
    public static void main(String[] args) throws Exception {
        Mouse razer = new Mouse("Naga", 700, "Gamer", "Mouse Colorido");
        Livro livro = new Livro("Harry Potter", 150, "JKR", "Fantasia");

        Carrinho venda1 = new Carrinho();
        Carrinho venda2 = new Carrinho();

        List<Produto> prod = new ArrayList<Produto>();
        prod.add(razer);
        prod.add(livro);

        venda1.vender(razer);
        venda2.vender(prod);

        System.out.println(venda1);
        System.out.println(venda2);
    }
}
