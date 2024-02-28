package Atividades;
import java.util.Scanner;

public class ParesEimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dite um numero: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("O numero digitado é Par");
		else 
			System.out.println("O numero digitado é impar");
	}

}	
