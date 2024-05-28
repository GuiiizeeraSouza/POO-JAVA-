package Loja;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void calculaSalario() {
        System.out.println("salario: " + getSalario());
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }


}
