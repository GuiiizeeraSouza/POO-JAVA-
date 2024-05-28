package Produto2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 2500.0, 5));
        produtos.add(new Produto("Mouse", 50.0, 10));
        produtos.add(new Produto("Teclado", 100.0, 8));

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: "
                    + produto.getQuantidade());
        }
    }
}
