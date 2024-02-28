package Atividades;
import java.util.Scanner;

public class PontoQuadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a coordenada x:");
        double x = scanner.nextDouble();
        
        System.out.println("Digite a coordenada y:");
        double y = scanner.nextDouble();
        
        if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quarto quadrante.");
        } else if (x == 0 && y != 0) {
            System.out.println("O ponto está sobre o eixo das ordenadas (y).");
        } else if (x != 0 && y == 0) {
            System.out.println("O ponto está sobre o eixo das abcissas (x).");
        } else {
            System.out.println("O ponto está na origem.");
        }
        
        scanner.close();
    }
}

