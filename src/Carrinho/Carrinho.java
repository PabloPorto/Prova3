package Carrinho;

import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class Carrinho {
	private Integer id;
	private List<Produto> listaDeProdutos;

	public Carrinho(Integer id) {
		this.id = id;
		listaDeProdutos = new ArrayList<>();
	}
	
	public void adcionaProduto(Produto p) {
		listaDeProdutos.add(p);
	}
	
	public double precoTotal() {
		double valorTotal = 0;
		for(Produto p : listaDeProdutos) {
			valorTotal += p.getPreco();
		}
		return valorTotal;
	}
	
	
	
	
	
	

}
