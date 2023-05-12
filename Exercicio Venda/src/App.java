import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import funcionario.*;
import produto.*;

public class App {
    public static void main(String[] args) throws Exception {

        Celular celular = new Celular("MI Note 10", 3000, "Xiaomi", 999999999, "lite");
        Notbook notbook = new Notbook("Lenovo", 2500, "Lenovo", "I5 10305F", 8);
        
        System.out.println("Produtos antes do desconto");
        System.out.println(celular);
        System.out.println(notbook);
        System.out.println("--------------------------------");
        celular.calcularDesconto();
        notbook.calcularDesconto();
        System.out.println("Produtos depois do desconto");
        System.out.println(celular);
        System.out.println(notbook);
        System.out.println("--------------------------------");

        Vendedor vend1 = new Vendedor("Helo", 5000, 30, 0, 9, 15000);
        Vendedor vend2 = new Vendedor("Thalya", 2300, 25, 0, 7, 10000);
        Vendedor vend3 = new Vendedor("Marcola", 1750, 19, 0, 2, 2500);

        List<Vendedor> vendedores = new ArrayList<Vendedor>();
        vendedores.addAll(Arrays.asList(vend1, vend2, vend3));

        System.out.println("Vendedores antes da comissão");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor);
        }

        vend1.calcularComissao();
        vend2.calcularComissao();
        vend3.calcularComissao();

        System.out.println("--------------------------------");
        System.out.println("Vendedores depois da comissão");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor);
        }

        Gerente gerente = new Gerente("Helo", 5000, 30, 0, vendedores);
        System.out.println("Gerente antes da comissão");
        System.out.println(gerente);
        System.out.println("Gerente depois da comissão");
        gerente.calcularComissao();
        System.out.println(gerente);
    }
}
