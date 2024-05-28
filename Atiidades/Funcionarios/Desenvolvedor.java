package Funcionarios;

class Desenvolvedor extends Funcionario {
    private int horasExtras;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    public void adicionarHorasExtras(int horas) {
        this.horasExtras += horas;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [Nome: " + nome + ", Salário: " + salario + ", Horas Extras: " + horasExtras + "]";
    }
}
