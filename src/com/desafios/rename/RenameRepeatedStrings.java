package com.desafios.rename;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RenameRepeatedStrings {
	
	public static void main(String args[])	{
		String[] users = {"Sara", "Adriano", "Mario", "Sara", "Gerald", "Sara", "Adriano"};
		
		//Usando HashMap conplexidade O(2n)
		
		Map<String, Integer> usersMap = new HashMap<String, Integer>();
		List<String> renamedUsers = new ArrayList<String>();
		
		for(String name : users) {
			Integer countName = usersMap.get(name); //Retorna a quantidade de elementos na lista
			if(countName == null) {
				usersMap.put(name, 1);
				renamedUsers.add(name);
			} else {
				usersMap.put(name, ++countName); //Adiciona o elemento mais a quantidade de repetições
				renamedUsers.add(name.concat(countName.toString()));
			}		
		}
		
		for(String name : renamedUsers ) {
			System.out.println(name); //Imprime elementos renomeados
		}
		
		//Testes
		//System.out.println(usersMap.get("Sara"));
		//System.out.println(usersMap.get("Adriano"));
		//System.out.println(usersMap.get("Mario"));
		//System.out.println(usersMap.get("Cratos"));
	}	
	
	

}