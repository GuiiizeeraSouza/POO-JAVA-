package atividades;
import java.util.Scanner;


public class atividade6 {	

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);

        scanner.close();
	}

}
