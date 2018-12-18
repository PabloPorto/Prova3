package Facade;

public class Facade {
	private Sistema sistema = new Sistema();
	
	public void adicionaOficina(String nome, String categoria, double valor, double cargaHoraria) {
		sistema.adicionaOficina(nome, categoria, valor, cargaHoraria);
	
	}
	public void adicionaLivro(String nome, String categoria, double valor, String estado) {
		sistema.adicionaLivro(nome, categoria, valor, estado);
	}
	
	public void adicionaJogo(String nome, String categoria, double valor) {
		sistema.adicionaJogo(nome, categoria, valor);
	}
	
	public String exibirProduto(String nome) {
		return sistema.exibirProduto(nome);
	}
	
	public double obterPreco(String nome) {
		return sistema.obterPreco(nome);
	}
	
	public void criaCarrinho(Integer id) {
		sistema.criaCarrinho(id);
	}
	
	public void adicionaProdutoAoCarrinho(Integer id, String nomeProduto) {
		sistema.adicionaProdutoAoCarrinho(id, nomeProduto);
	}
	
	public double totalizaCarrinho(Integer id) {
		return sistema.totalizaCarrinho(id);
	}
	
	public void configuraOrdenacao(String ord) {
		sistema.configuraOrdenacao(ord);
	}
	
	public String listarProdutos() {
		return sistema.listarProdutos();
	}
	
	
}
