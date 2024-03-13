/*2 - Escreva um algoritmo que leia os valores para um vetor de 10 elementos 
 * e então mostre na tela a quantidade de números pares e ímpares.*/

package atividades;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Quantidade de números pares: " + evenCount);
        System.out.println("Quantidade de números ímpares: " + oddCount);

        scanner.close();
	}

}
