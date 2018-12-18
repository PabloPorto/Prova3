package Model;

public class Jogo extends Produto{

	public Jogo(String nome, String categoria, double valor) {
		super(nome, categoria, valor);
	}
	
	public double calculaPreco() {
		if (this.categoria.equalsIgnoreCase("Infantil")){
			return this.preco = this.valor - (this.valor * 0.05);
		}
		return this.preco = this.valor;
	}
	
}
