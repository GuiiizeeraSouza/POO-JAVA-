package exercicios;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Livro l1 = new Livro();

        l1.titulo = "Biblia";
        l1.autor = "Deus";
        l1.ano = 000;

        System.out.println("Titulo: "+l1.titulo+" Autor: "+l1.autor+" Data: "+l1.ano);
    }
}
