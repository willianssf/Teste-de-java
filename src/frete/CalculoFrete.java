package frete;

import entities.Livros;

public class CalculoFrete implements TaxaFrete {

	@Override
	public double taxa(double frete) {
		
		double calc = frete*20/100;
		
		return calc;
	}

}
