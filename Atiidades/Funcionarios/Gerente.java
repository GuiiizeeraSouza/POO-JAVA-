package Funcionarios;

class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem);
        salario += bonusAnual * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return "Gerente [Nome: " + nome + ", Salário: " + salario + ", Bônus Anual: " + bonusAnual + "]";
    }
}