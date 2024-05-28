package Produto;

public class ProdutoComDesconto extends Produto {
	private double percentualDesconto;
	
	
	public ProdutoComDesconto(String name, double preco, double percentualDesconto) {
		super(name, preco);
		this.percentualDesconto = percentualDesconto;
	}
	
	@Override
    public void desconto() {
        double desconto = getPreco() * (percentualDesconto / 100);
        double precoComDesconto = getPreco() - desconto;
        System.out.println("O preço com desconto é: " + precoComDesconto);
    }
}