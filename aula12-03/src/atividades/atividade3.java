package atividades;
	import java.util.Scanner;
	
public class atividade3 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int[] array1 = new int[20];
		        int[] array2 = new int[20];
		        int[] sumArray = new int[20];

		        System.out.println("Digite os elementos do primeiro vetor:");
		        for (int i = 0; i < 20; i++) {
		            array1[i] = scanner.nextInt();
		        }

		        System.out.println("Digite os elementos do segundo vetor:");
		        for (int i = 0; i < 20; i++) {
		            array2[i] = scanner.nextInt();
		        }

		        for (int i = 0; i < 20; i++) {
		            sumArray[i] = array1[i] + array2[i];
		        }

		        System.out.println("A soma dos elementos dos vetores é:");
		        for (int i = 0; i < 20; i++) {
		            System.out.print(sumArray[i] + " ");
		        }

		        scanner.close();
		    }
	}

