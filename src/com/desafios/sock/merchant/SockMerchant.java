package com.desafios.sock.merchant;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SockMerchant {

    static int countSockPairs(int n, int[] ar) {
        int countNumberOfPairs = 0;
        Map<Integer, Integer> pairsOfSocksMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < ar.length && i < n; i++){
            if(pairsOfSocksMap.get(new Integer(ar[i])) == null){
            	pairsOfSocksMap.put(ar[i], 1); //Adiciona um caso não exista correspondência no map
            } else {
                countNumberOfPairs ++; //Incrementa a quantidade de par
                pairsOfSocksMap.remove(ar[i]); //Remove os valores se acha correspondência
            }
        }
        return countNumberOfPairs;
    }

    public static void main(String[] args) throws IOException {
    	int[] sockColors = new int[9000000];
    	
    	for(int i =0; i < 9000000; i++) {
    		sockColors[i] = (int) ThreadLocalRandom.current().nextInt(1, 101);
    	}

    	long startTime = System.nanoTime();
    	
        System.out.println(countSockPairs(9000000, sockColors));

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("Nanosegundos  : " + timeElapsed);
		System.out.println("Milisegundos : " + timeElapsed / 1000000);
    }
}
