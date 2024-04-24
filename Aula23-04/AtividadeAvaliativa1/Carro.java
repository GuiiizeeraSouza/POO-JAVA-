import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibeDetalhes() {
        System.out.println("Detalhes do carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o ano do carro: ");
        int ano = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano);

        carro.exibeDetalhes();

        scanner.close();
    }
}
