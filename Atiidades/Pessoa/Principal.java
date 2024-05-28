package Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25, 'M'));
        pessoas.add(new Pessoa("Maria", 30, 'F'));
        pessoas.add(new Pessoa("Pedro", 20, 'M'));
        pessoas.add(new Pessoa("Ana", 28, 'F'));

        int quantidadeMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres na lista: " + quantidadeMulheres);
    }

    public static int contarMulheres(List<Pessoa> pessoas) {
        int count = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'F') {
                count++;
            }
        }
        return count;
    }
}
