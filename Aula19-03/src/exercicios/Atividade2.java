/*2 - Crie uma classe chama Computador que possua 4 atributos: marca, modelo, tipo (notebook,
netbook, tablet, etc) e preço.
• Essa classe Computador também deverá ser executável, entretanto crie uma outra classe
executável que irá instanciar a classe Computador, criando 2 objetos. O primeiro objeto deverá
ser criado através da solicitação dos valores ao usuário por linha de execução. Já, os valores do
segundo objeto, deverão ser definidos no código-fonte da classe que o criou. Exiba na tela os
resultados. */

package exercicios;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador pc1 = new Computador();

        System.out.println("Monte seu pc!");
        System.out.println("Marca: ");
        pc1.marca = scanner.next();
        System.out.println("Modelo: ");
        pc1.modelo = scanner.next();
        System.out.println("Valor: ");
        pc1.preco = scanner.nextInt();

        System.out.println("Você montou um pc com as config:");
        System.out.println("Marca: "+pc1.marca);
        System.out.println("Modelo: "+pc1.modelo);
        System.out.println("Valor: "+pc1.preco);

        Computador pc2 = new Computador();
        pc2.marca = "Dell";
        pc2.modelo = "G15";
        pc2.preco = 5000;

        System.out.println("O pc que recomendamos a você é o seguinte:");
        System.out.println("Marca: "+pc2.marca);
        System.out.println("Modelo: "+pc2.modelo);
        System.out.println("Valor: "+pc2.preco);

        scanner.close();
    }
}
