package Conta;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, "João", 1500.0));
        contas.add(new Conta(2, "Maria", 2000.0));
        contas.add(new Conta(3, "Pedro", 1000.0));

        Conta contaMaiorSaldo = encontrarContaMaiorSaldo(contas);
        System.out.println("Conta com maior saldo: " + contaMaiorSaldo);
    }

    public static Conta encontrarContaMaiorSaldo(List<Conta> contas) {
        Conta contaMaiorSaldo = contas.get(0);
        for (Conta conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        return contaMaiorSaldo;
    }
}
