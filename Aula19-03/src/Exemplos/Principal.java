package Exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "João";
		p1.idade = 22;
		Pessoa p2 = new Pessoa();
		p2.nome =  "Maria";
		p2.idade = 12;
		Pessoa p3 = new Pessoa();
		p3.nome =  "Ricardo";
		p3.idade = 33;
		
		System.out.println("O nome da primeira pessoa eh: "+p1.nome+"E tem: "+p1.idade+" anos!");
		System.out.println("O nome da segunda pessoa eh: "+p2.nome+"E tem: "+p2.idade+" anos!");
		System.out.println("O nome da terceira pessoa eh: "+p3.nome+"E tem: "+p3.idade+" anos!");
		

	}

}
