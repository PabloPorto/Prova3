package Model;

public class Livro extends Produto{
	private String estado;

	public Livro(String nome, String categoria, double valor, String estado) {
		super(nome, categoria, valor);
		this.estado = estado;
	}
	
	@Override
	public double calculaPreco() {
		if (this.estado.equalsIgnoreCase("Usado")) {
			return this.preco = this.valor - (this.valor * 0.5);
		}
		return this.preco = this.valor;
	}
}
