package Funcionarios;

public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Carlos", 5000.0, 2000.0);
        funcionarios[1] = new Desenvolvedor("Ana", 3000.0, 10);
        funcionarios[2] = new Desenvolvedor("Pedro", 3200.0, 5);

        System.out.println("Antes do aumento de salário:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(10); // Aumenta o salário em 10% para todos
        }

        System.out.println("\nDepois do aumento de salário:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
