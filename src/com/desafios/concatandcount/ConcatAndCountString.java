package com.desafios.concatandcount;

public class ConcatAndCountString {

	public static void main(String[] args) {
		System.out.println(repeatedString("abafaystudfuaysasdgfasdfasdf", 20));
	}

	static long repeatedString(String s, long n) {
		long divisor = n / s.length();
		long restOfDivision = n % s.length();
		long count = 0L;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		count = (count * divisor);

		for (int i = 0; i < restOfDivision; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}
