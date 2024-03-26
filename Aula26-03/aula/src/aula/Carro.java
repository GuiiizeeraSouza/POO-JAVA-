package aula;

public class Carro {
	public String marca;
	public String modelo;
	
	public void alugar() {
		System.out.println("Carro "+marca+" - modelo: "+modelo+"; alugado!");
	}
	public void devolver() {
		System.out.println("Carro "+marca+" - modelo: "+modelo+"; devolvido!");
	}
}
