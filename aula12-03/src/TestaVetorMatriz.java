import java.util.Scanner;

public class TestaVetorMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[2];
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Digite o elemento: "+i);
        numeros[i] = scanner.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("O elemento de índice" + i + "é" + numeros[i]);
		}
		
		numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o elemento: "+i);
	        numeros[i] = scanner.nextInt();
			}
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("O elemento de índice" + i + "é" + numeros[i]);
			}
		
		int n;
		System.out.println("Digite o tamanho do vetor: ");
		n = sc.nextInt();
		numeros - new int [n];
		for ( n = 0; n < numeros.length; n++) {
			System.out.println("Digite o elemento: "+n);
	        numeros[n] = scanner.nextInt();
			}
			for (n = 0; n < numeros.length; n++) {
				System.out.println("O elemento de índice" + n + "é" + numeros[n]);
			}
	}

}
