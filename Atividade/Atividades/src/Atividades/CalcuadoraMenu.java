package Atividades;
import java.util.Scanner;

public class CalcuadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (x)");
        System.out.println("4 - Divisão (/)");
        
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0;
        switch (operacao) {
            case '1':
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case '2':
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case '3':
            case 'x':
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case '4':
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Impossível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
        
        scanner.close();
    }
}
