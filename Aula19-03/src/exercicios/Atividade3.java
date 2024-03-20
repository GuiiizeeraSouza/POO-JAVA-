package exercicios;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        p1.nome = "Guilherme";
        p1.idade = 20;
        p1.genero = "Masculino";

        System.out.println("Meu nome é: "+p1.nome+", tenho "+p1.idade+" anos, "+p1.genero);

        scanner.close();
    }
}
