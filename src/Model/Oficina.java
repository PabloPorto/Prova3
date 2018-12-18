package Model;

public class Oficina extends Produto{
	private double cargaHoraria;

	public Oficina(String nome, String categoria, double valor, double cargaHoraria) {
		super(nome, categoria, valor);
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override 
	public double calculaPreco() {
		return this.preco = this.valor * this.cargaHoraria;
	}
	
}
