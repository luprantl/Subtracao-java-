package Classes;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora {
	
	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n1 == 0 || n2 == 0) {
			return 0;
		}else {
//			System.out.println("Calculo int simples");
		return n1 / n2;
		}
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n1 == 0 || n2 == 0) {
			return 0f;
		}else {
//			System.out.println("Calculo simples float");
		return n1 / n2;
		}
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n1 == 0 || n2 == 0) {
			return 0d;
		}else {
//			System.out.println("Calculo simples double");
		return n1 / n2;
		}
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0;
			}else {
//				System.out.println("Calculo array int");
			divisao /= numeros[i];
			}
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0f;
			}else {
//				System.out.println("Calculo array float");
			divisao /= numeros[i];
			}
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double divisao = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i] == 0) {
				return 0d;
			}else {
//				System.out.println("Calculo array double");
			divisao /= numeros[i];
			}
		}
		return divisao;
	}
}