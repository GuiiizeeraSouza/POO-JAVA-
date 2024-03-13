/* 1 - Fazer um algoritmo que leia dez números e escreva-os na ordem contrária à ordem de leitura.
Exemplo:
a. lê: |7|40|3|9|21|0|63|31|7|22|
b. escreve: |22|7|31|63|0|21|9|3|40|7|*/

package atividades;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Digite 10 números:");

        
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem contrária:");

       
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}

