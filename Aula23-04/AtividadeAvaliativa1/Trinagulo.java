import java.util.Scanner;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public boolean verificaEquilatero() {
        return ladoA == ladoB && ladoA == ladoC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do lado A do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Informe o valor do lado B do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Informe o valor do lado C do triângulo: ");
        double ladoC = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);

        if (triangulo.verificaEquilatero()) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo não é equilátero.");
        }

        scanner.close();
    }
}
