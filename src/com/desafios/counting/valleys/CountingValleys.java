package com.desafios.counting.valleys;

public class CountingValleys {
	public static void main(String args[]) {
		countingValleys(12, "DDUUDDUDUUUD"); // Passos subindo U ou descendo D
	}

	//Conta a quantidade de vales que o caminhante percorre
	static int countingValleys(int n, String s) {
		int numberOfValleys = 0;
		int i = 0;
		int seaLevel = 0;

		while (i < n) {
			if (s.charAt(i) == 'U') {
				if (seaLevel == -1) { //Verifica se o passo anterior estava abaixo do nível do mar.
					numberOfValleys++; //Se o passo atual estiver no nível do mar e o anterior estiver abaixo, conta mais um vale.
				}
				seaLevel++;
			} else {
				seaLevel--;
			}
			i++;
		}
		System.out.println(numberOfValleys);
		return numberOfValleys;
	}

}
