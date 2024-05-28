package Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1 = new Produto("Produto Sem Desconto", 100.0);
		ProdutoComDesconto produto2 = new ProdutoComDesconto("Produto Com Desconto", 100.00, 10);
				
		  produto1.desconto();  
	      produto2.desconto();
	}

}

