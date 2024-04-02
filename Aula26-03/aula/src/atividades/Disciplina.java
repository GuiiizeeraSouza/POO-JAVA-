package atividades;

import java.util.Scanner;

// Classe Disciplina
class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String nomeProfessor;

    // Método para atribuir os valores
    public void setValues(String nome, int cargaHoraria, String nomeProfessor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
    }

    // Métodos para recuperar os valores
    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }
}

// Classe Livro
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;

    // Método para obter as informações do livro
    public String getInfo() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao +
                "\nGênero: " + genero + "\nEmprestado: " + (emprestado ? "Sim" : "Não");
    }

    // Método para fazer o empréstimo do livro
    public void emprestarLivro() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro já emprestado.");
        }
    }

    // Método para fazer a devolução do livro
    public void devolverLivro() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Livro já devolvido.");
        }
    }
}

// Classe Pessoa
class Pessoa {
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereco;
    private boolean admin;

    // Método para obter o email da pessoa
    public String getEmail() {
        return email;
    }

    // Método para promover a pessoa a admin
    public void promoverAdmin() {
        admin = true;
    }

    // Método construtor
    public Pessoa(String nome, String email, String dataNascimento, String endereco, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = admin;
    }
}

// Classe RealizaConta
class RealizaConta {
    // Método para realizar a soma
    public static double soma(double a, double b) {
        return a + b;
    }

    // Método para realizar a subtração
    public static double subtracao(double a, double b) {
        return a - b;
    }

    // Método para realizar a divisão
    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }

    // Método para realizar a multiplicação
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
}

// Classe Calculadora
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Exemplo de utilização dos métodos da classe RealizaConta
        System.out.println("Soma: " + RealizaConta.soma(valor1, valor2));
        System.out.println("Subtração: " + RealizaConta.subtracao(valor1, valor2));
        System.out.println("Divisão: " + RealizaConta.divisao(valor1, valor2));
        System.out.println("Multiplicação: " + RealizaConta.multiplicacao(valor1, valor2));

        scanner.close();
    }
}
