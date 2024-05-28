package ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000.0); // Deposita dinheiro
        conta.depositar(new Cheque(500.0)); // Deposita cheque

        System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
    }

}
