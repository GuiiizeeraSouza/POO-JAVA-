package Loja;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("GuilhereALenda", 20, 10.000);
        funcionario1.setSalario(90.0);
        
        Gerente gerente1 = new Gerente("FranGay", 20, 1000);
        
        System.out.println(funcionario1.getNome() + funcionario1.getIdade() + funcionario1.getSalario());
        funcionario1.calculaSalario();

        System.out.println(gerente1.getNome() + gerente1.getIdade() + gerente1.getSalario() + gerente1.getBonus());
        gerente1.calculaSalario();
        
    }
}
