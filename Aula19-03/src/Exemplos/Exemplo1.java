package Exemplos;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		System.out.println("Digite seu nome: ");
		p1.nome =  scanner.next();
		System.out.println("Digite sua idade: ");
		p1.idade = scanner.nextInt();
		Pessoa p2 = new Pessoa();
		System.out.println("Digite seu nome: ");
		p2.nome =  scanner.next();
		System.out.println("Digite sua idade: ");
		p2.idade = scanner.nextInt();
		Pessoa p3 = new Pessoa();
		System.out.println("Digite seu nome: ");
		p3.nome =  scanner.next();
		System.out.println("Digite sua idade: ");
		p3.idade = scanner.nextInt();
		
		System.out.println("O nome da primeira eh: "+p1.nome+", Idade: "+p1.idade);
		System.out.println("O nome da segunda eh: "+p2.nome+", Idade: "+p2.idade);
		System.out.println("O nome terceira eh: "+p3.nome+", Idade: "+p3.idade);
		
	scanner.close();
	}

}
