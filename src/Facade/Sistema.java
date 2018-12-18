package Facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Carrinho.Carrinho;
import Model.*;
import Ordenacao.*;

public class Sistema {
	private Map<String,Produto> produtos;
	private Map<Integer,Carrinho> carrinhos;
	private List<Produto> listaDeProdutos;
	
	public Sistema() {
		produtos = new HashMap<>();
		carrinhos = new HashMap<>();
		listaDeProdutos = new ArrayList<>();
	}
	
	public void adicionaOficina(String nome, String categoria, double valor, double cargaHoraria) {
		if(produtos.containsKey(nome)) {
			throw new RuntimeException("Nome já cadastrado!");
		}
		if (!categoria.equalsIgnoreCase("infantil") &&  !categoria.equalsIgnoreCase("juvenil")) {
			throw new IllegalArgumentException("Categoria não pode ser cadastrada");
		}
		produtos.put(nome, new Oficina(nome, categoria, valor,cargaHoraria));
		listaDeProdutos.add(produtos.get(nome));
	}
	
	public void adicionaLivro(String nome, String categoria, double valor, String estado) {
		if(produtos.containsKey(nome)) {
			throw new RuntimeException("Nome já cadastrado!");
		}
		if (!categoria.equalsIgnoreCase("infantil") &&  !categoria.equalsIgnoreCase("juvenil")) {
			throw new IllegalArgumentException("Categoria não pode ser cadastrada");
		}
		if (!estado.equalsIgnoreCase("Novo") && !estado.equalsIgnoreCase("Usado")) {
			throw new IllegalArgumentException("Estado não pode ser cadastrado.");
		}
		produtos.put(nome, new Livro(nome, categoria, valor, estado));
		listaDeProdutos.add(produtos.get(nome));
	}
	
	public void adicionaJogo(String nome, String categoria, double valor) {
		if(produtos.containsKey(nome)) {
			throw new RuntimeException("Nome já cadastrado!");
		}
		if (!categoria.equalsIgnoreCase("infantil") &&  !categoria.equalsIgnoreCase("juvenil")) {
			throw new IllegalArgumentException("Categoria não pode ser cadastrada");
		}
		produtos.put(nome, new Jogo(nome, categoria, valor));
		listaDeProdutos.add(produtos.get(nome));
	}
	
	public String exibirProduto(String nome) {
		if(!produtos.containsKey(nome)) {
			throw new RuntimeException("Produto não cadastrado!");
		}
		return produtos.get(nome).toString();
	}
	
	public double obterPreco(String nome) {
		if(!produtos.containsKey(nome)) {
			throw new RuntimeException("Produto não cadastrado!");
		}
		return produtos.get(nome).getPreco();
	}
	
	public void criaCarrinho(Integer id) {
		carrinhos.put(id, new Carrinho(id));
	}
	
	public void adicionaProdutoAoCarrinho(Integer id, String nomeProduto) {
		if (carrinhos.containsKey(id) == false) {
			throw new RuntimeException("Carrinho não cadastrado!");
		}
		if (produtos.containsKey(nomeProduto) == false) {
			throw new RuntimeException("Produto não cadastrado!");
		}
		carrinhos.get(id).adcionaProduto(produtos.get(nomeProduto));
	}
	
	public double totalizaCarrinho(Integer id) {
		if (carrinhos.containsKey(id) == false) {
			throw new RuntimeException("Carrinho não cadastrado!");
		}
		return carrinhos.get(id).precoTotal();
		
	}
	
	public void configuraOrdenacao(String ord) {
		if (ord.equalsIgnoreCase("Categoria")){
			Collections.sort(listaDeProdutos, new OrdenaPorCategoria());
		}
		if (ord.equalsIgnoreCase("Nome")) {
			Collections.sort(listaDeProdutos, new OrdenaPorNome());
		}
		if(ord.equalsIgnoreCase("Preco")) {
			Collections.sort(listaDeProdutos, new OrdenaPorPreco());
		}
	}
	
	public String listarProdutos() {
		String aux = "[";
		for (int i=0; i<listaDeProdutos.size();i++) {
			if(i<listaDeProdutos.size()-1) {
				aux += listaDeProdutos.get(i) + ", ";
			}
			else {
				aux += listaDeProdutos.get(i);
			}
		}
		aux += "]";
		return aux;
	}

}
