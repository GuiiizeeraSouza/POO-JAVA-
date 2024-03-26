package aula;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Carro c = new Carro();
		
		
		System.out.println("Digite a marca:");
		c.marca = scanner.next();
		System.out.println("Digite o modelo:");
		c.modelo = scanner.next();
		
		
		c.alugar();
		c.devolver();
		
		scanner.close();

	}

}
