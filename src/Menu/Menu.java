package Menu;

import Facade.Facade;
import Facade.Sistema;

public class Menu {
	public static void main(String[] args) {
		try{
			
			Facade facade = new Facade();
			
			facade.adicionaJogo("Futebol", "Infantil", 890.2);
			facade.adicionaLivro("Rei Leão", "infantil", 200.0, "Usado");
			facade.adicionaOficina("Oficina do João","Juvenil" , 2000.0, 2);
			
			
			Sistema s1 = new Sistema();
			s1.adicionaJogo("Bola","Infantil",800); // espera-se preco = 760;
			s1.adicionaLivro("REi", "infantil", 200.0, "Usado"); // espera-se preco = 100.0;
			s1.adicionaOficina("Oficina do João","Juvenil" , 2000.0, 2); // espera-se preco = 4000.0
			
			System.out.println(s1.exibirProduto("Bola"));
			System.out.println(s1.exibirProduto("REi"));
			System.out.println(s1.exibirProduto("Oficina do João"));
			System.out.println("---------------------------------------------");
			
			System.out.println(s1.obterPreco("Bola"));
			System.out.println(s1.obterPreco("REi"));
			System.out.println(s1.obterPreco("Oficina do João"));
			System.out.println("---------------------------------------------");
			
			
			s1.criaCarrinho(10);
			s1.adicionaProdutoAoCarrinho(10, "Bola");
			s1.adicionaProdutoAoCarrinho(10, "REi");
			System.out.println("Preço esperado: 860.0");
			System.out.println(s1.totalizaCarrinho(10));
			System.out.println("----------------------------------------------");
			
			s1.configuraOrdenacao("Preco");
			System.out.println("Esperado: 100, 760, 4000");
			System.out.println(s1.listarProdutos());
			System.out.println("----------------------------------------------");
		
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}