package Atividades;
import java.util.Scanner;

public class SituacaoEleitoral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        

        if (idade < 16) {
            System.out.println("Você não está apto a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Seu voto é facultativo.");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }

        scanner.close();
    }
}
