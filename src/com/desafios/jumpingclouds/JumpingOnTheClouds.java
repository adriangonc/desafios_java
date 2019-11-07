package com.desafios.jumpingclouds;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };
		jumpingOnTheClouds(clouds);
	}

	static int jumpingOnTheClouds(int[] c) {
		int numberOfJumpsToWin = 0;
		int i = 0;
		while (i < c.length) {
			if (i >= c.length - 2) {
				numberOfJumpsToWin++;
				System.out.println(numberOfJumpsToWin);
				return numberOfJumpsToWin;
			}

			if (c[i + 2] != 1) {
				numberOfJumpsToWin++;
				if (i + 2 == (c.length - 1)) {
					System.out.println(numberOfJumpsToWin);
					return numberOfJumpsToWin;
				} else {
					i += 2;
				}
			} else {
				i++;
				numberOfJumpsToWin++;
			}

		}

		System.out.println(numberOfJumpsToWin);
		return numberOfJumpsToWin;
	}
}
