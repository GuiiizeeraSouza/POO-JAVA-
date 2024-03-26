package exemplos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora c = new Calculadora();
        double resultado;
        resultado = c.somar();

        System.out.println("Diga o valor do A: ");
        c.a = scanner.nextInt();

        System.out.println("Digite ovalor de B: ");
        c.b = scanner.nextInt();

        System.out.println("O valor da resposta: "+resultado);
    }
}
