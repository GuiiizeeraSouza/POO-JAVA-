package Atividades;
import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Digite a marcação do odômetro no início do dia (em km):");
        double odometroInicio = scanner.nextDouble();
        
        System.out.println("Digite a marcação do odômetro no final do dia (em km):");
        double odometroFinal = scanner.nextDouble();
        
     
        double totalQuilometragem = odometroFinal - odometroInicio;
        
       
        System.out.println("Digite o número de litros de combustível gasto:");
        double litrosCombustivel = scanner.nextDouble();
        
        System.out.println("Digite o valor total recebido dos passageiros (em R$):");
        double valorTotalRecebido = scanner.nextDouble();
        
  
        double mediaConsumo = totalQuilometragem / litrosCombustivel;
        
    
        double lucroDia = valorTotalRecebido - (litrosCombustivel * 4.90);
        

        System.out.println("Média do consumo: " + mediaConsumo + " Km/l");
        System.out.println("Lucro líquido do dia: R$" + lucroDia);
        
     
        scanner.close();
    }
}

