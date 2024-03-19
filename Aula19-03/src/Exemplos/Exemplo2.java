package Exemplos;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Laboratório p1 = new Laboratório();
		System.out.println("Digite o nome do professor: ");
		p1.professor=  scanner.next();
		System.out.println("Digite o numero da sala: ");
		p1.sala=  scanner.nextInt();
		
		System.out.println("O nome do Professor eh: "+p1.professor);
		System.out.println("O numero da sala eh: Sala "+p1.sala);
		
		
		scanner.close();
	}

}
