package Produto;

public class Produto {
    private String name;
    private double preco;
    
   public Produto(String name, double preco) {
       super();
       this.name = name;
       this.preco = preco;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public double getPreco() {
       return preco;
   }

   public void setPreco(double preco) {
       this.preco = preco;
   }

   public void desconto() {
        System.out.println("Desconte não dispnivel para este produto.");
    }
}
