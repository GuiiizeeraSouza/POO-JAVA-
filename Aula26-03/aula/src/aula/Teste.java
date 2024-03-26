package aula;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        Carro b = new Carro();

        System.out.println("Teste: ");
        b.marca = scanner.next();

        scanner.close();
    }
}
