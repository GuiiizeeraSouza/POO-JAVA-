public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do depósito não pode ser negativo.");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do saque não pode ser negativo.");
        }
        if (valor > saldo + limite) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 500);
        try {
            conta.depositar(200);
            conta.sacar(300);
            conta.sacar(1500);
            conta.depositar(-100); // Testando depósito com valor negativo
            conta.sacar(-200); // Testando saque com valor negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
