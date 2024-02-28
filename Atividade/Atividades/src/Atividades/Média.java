package Atividades;
import java.util.Scanner;

public class Média {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quatro valores inteiros:");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();
        int valor4 = scanner.nextInt();
        
        double media = (valor1 + valor2 + valor3 + valor4) / 4.0;
        
        System.out.println("A média dos valores é: " + media);
        
        System.out.println("Valores superiores à média:");
        if (valor1 > media) {
            System.out.println(valor1);
        }
        if (valor2 > media) {
            System.out.println(valor2);
        }
        if (valor3 > media) {
            System.out.println(valor3);
        }
        if (valor4 > media) {
            System.out.println(valor4);
        }

        scanner.close();
    }
}

