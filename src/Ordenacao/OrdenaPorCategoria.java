package Ordenacao;

import java.util.Comparator;

import Model.Produto;

public class OrdenaPorCategoria implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getCategoria().compareTo(o2.getCategoria());
	}
}
