package com.desafios.counting.valleys;

public class CountingValleys {
	public static void main(String args[]) {
		countingValleys(12, "DDUUDDUDUUUD");
	}

	static int countingValleys(int n, String s) {
		int numberOfValleys = 0;
		int i = 0;
		int seaLevel = 0;

		while (i < n) {
			if (s.charAt(i) == 'U') {
				if (seaLevel == -1) {
					numberOfValleys++;
				}
				seaLevel++;
			} else {
				seaLevel--;
			}
			i++;
		}
		return numberOfValleys;
	}

}
