package Ordenacao;

import java.util.Comparator;

import Model.Produto;

public class OrdenaPorNome implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
