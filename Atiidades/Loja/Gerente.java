package Loja;

public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, int idade, double salario){
        super(nome, idade, salario);
        this.bonus = 50;
    }

    public double getBonus() {
        return bonus;
    }

    // Setter para o bônus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculaSalario(){
        double salarioComBonus = getSalario() + bonus;
        setSalario(salarioComBonus);
        System.out.println("Salario gerente:" + salarioComBonus);
    }
}
