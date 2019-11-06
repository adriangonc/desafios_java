package com.desafios.sock.merchant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SockMerchantJoao {
	public static void main(String arg[]) {
		Integer[] ar = new Integer[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, ar));

		Integer[] sockColors = new Integer[9000000];

		for (int i = 0; i < 9000000; i++) {
			sockColors[i] = (int) ThreadLocalRandom.current().nextInt(1, 101);
		}

		long startTime = System.nanoTime();

		System.out.println(sockMerchant(sockColors.length, sockColors));

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;

		System.out.println("Nanosegundos  : " + timeElapsed);
		System.out.println("Milisegundos : " + timeElapsed / 1000000);
	}

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, Integer[] ar) {

		List<Integer> list = Arrays.asList(ar);
		list.sort(Integer::compareTo);

		int r = 0;

		int limite = ar.length > n ? n - 2 : ar.length - 2;

		int i = 0;

		while (i < limite) {

			if (list.get(i) == list.get(i + 1)) {
				r = r + 1;
				i = i + 2;
			} else {
				i = i + 1;
			}
		}

		return r;
	} 
}
