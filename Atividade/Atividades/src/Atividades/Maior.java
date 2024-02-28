package Atividades;
import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("Digite o valor de 3 numeros inteiros: ");
	      int numero1 = scanner.nextInt();
	      int numero2 = scanner.nextInt();
	      int numero3 = scanner.nextInt();
	      
	      if ((numero1 > numero2) && (numero1 > numero3)) {
	    	    System.out.println("O número " + numero1 + " é o maior número.");
	    	}
	    	if ((numero2 > numero1) && (numero2 > numero3)) {
	    	    System.out.println("O número " + numero2 + " é o maior número.");
	    	}
	    	if ((numero3 > numero2) && (numero3 > numero1)) {
	    	    System.out.println("O número " + numero3 + " é o maior número.");
	    	}

	        scanner.close();
	      
	      }

}
