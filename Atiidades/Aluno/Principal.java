package Aluno;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 7.5, 8.0));
        alunos.add(new Aluno("Maria", 5.0, 6.0));
        alunos.add(new Aluno("Pedro", 6.5, 5.5));

        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Média: " + aluno.calcularMedia() + ", Status: "
                    + aluno.getStatus());
        }
    }
}
