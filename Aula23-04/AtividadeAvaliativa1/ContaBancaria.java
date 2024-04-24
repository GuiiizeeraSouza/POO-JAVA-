import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saque(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Informe o limite da conta: ");
        double limiteConta = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial, limiteConta);

        System.out.print("Informe o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        conta.saque(valorSaque);

        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Limite atual: " + conta.getLimite());

        scanner.close();
    }
}
