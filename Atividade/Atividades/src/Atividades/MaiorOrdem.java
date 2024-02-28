package Atividades;
import java.util.Scanner;

public class MaiorOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        
        int menor, meio, maior;
        menor = Math.min(numero1, Math.min(numero2, numero3));
        maior = Math.max(numero1, Math.max(numero2, numero3));
        meio = (numero1 + numero2 + numero3) - menor - maior;
        
        System.out.println("Os números em ordem crescente são:");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        scanner.close();
    }
}

