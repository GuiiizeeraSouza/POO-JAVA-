package Atividades;
import java.util.Scanner;

public class CopaDoBrasil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Placar do primeiro jogo:");
        System.out.print("Time da casa: ");
        int placarCasa = scanner.nextInt();
        System.out.print("Time de fora: ");
        int placarFora = scanner.nextInt();
        
        if (placarFora > placarCasa + 2) {
            System.out.println("O time de fora já se classificou.");
        } else {
            System.out.println("Os dois times se enfrentarão em um novo jogo.");

            System.out.println("\nPlacar do segundo jogo:");
            System.out.print("Time da casa: ");
            int placarCasa2 = scanner.nextInt();
            System.out.print("Time de fora: ");
            int placarFora2 = scanner.nextInt();

            if (placarCasa + placarCasa2 > placarFora + placarFora2) {
                System.out.println("O time da casa passou de fase.");
            } else if (placarCasa + placarCasa2 < placarFora + placarFora2) {
                System.out.println("O time de fora passou de fase.");
            } else {
                System.out.println("Houve empate. Será necessário um terceiro jogo para decidir.");
            }
        }

        scanner.close();
    }
}

