package Atividades;
import java.util.Scanner;

public class CalculoImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário mensal:");
        double salario = scanner.nextDouble();
        
        double aliquota = 0;
        double valorAliquota = 0;
        
        if (salario <= 1566.61) {
            aliquota = 0;
            valorAliquota = 0;
        } else if (salario <= 2347.85) {
            aliquota = 7.5;
            valorAliquota = salario * 0.075;
        } else if (salario <= 3130.51) {
            aliquota = 15;
            valorAliquota = salario * 0.15;
        } else if (salario <= 3911.63) {
            aliquota = 22.5;
            valorAliquota = salario * 0.225;
        } else {
            aliquota = 27.5;
            valorAliquota = salario * 0.275;
        }
        
        System.out.println("Alíquota do Imposto de Renda: " + aliquota + "%");
        System.out.println("Valor em R$ da alíquota: R$" + valorAliquota);
        
        scanner.close();
    }
}
