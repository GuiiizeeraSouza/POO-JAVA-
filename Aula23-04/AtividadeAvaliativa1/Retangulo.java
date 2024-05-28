import java.util.Scanner;

public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base =  base;
        this.altura = altura;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getBase(){
        return base;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int calcularArea() {
        return base*altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
        int altura = scanner.nextInt();

        System.out.println("Digite o valor da base: ");
        int base = scanner.nextInt();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("A area desse retangulo eh: " + retangulo.calcularArea());


        scanner.close();
    }
}   
