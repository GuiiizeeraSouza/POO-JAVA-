package Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        livros.add(new Livro("Guerra e Paz", "Leon Tolstói", 1869));
        livros.add(new Livro("A Montanha Mágica", "Thomas Mann", 1924));

        Collections.sort(livros, Comparator.comparingInt(Livro::getAno));

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
