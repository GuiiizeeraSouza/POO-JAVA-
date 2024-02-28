package Atividades;
import java.util.Scanner;

public class VerificarMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os números são múltiplos um do outro.");
        } else {
            System.out.println("Os números não são múltiplos um do outro.");
        }
        
        scanner.close();
    }
}

