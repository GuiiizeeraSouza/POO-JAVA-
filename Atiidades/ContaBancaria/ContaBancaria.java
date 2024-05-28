package ContaBancaria;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de dinheiro no valor de R$" + valor + " realizado com sucesso.");
    }

    public void depositar(Cheque cheque) {
        saldo += cheque.getValor();
        System.out.println("Depósito de cheque no valor de R$" + cheque.getValor() + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }
}
