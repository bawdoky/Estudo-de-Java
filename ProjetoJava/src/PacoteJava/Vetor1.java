package PacoteJava;

import java.util.Scanner;

//8
public class Vetor1 {
	public static void main(String Args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		int [] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float [] nota = new float [5];
		
		// Tamanho do array
		
		if(arrayDois.length >8) {
			System.out.println ("\n Tamanho do ArrayDois - Maior que 8!");
		}else {
			System.out.println (" \n Tamanho do arrayDois - Menor que 8!");
		}
		System.out.println ("\n Tamanho do ArrayUm = "+arrayUm.length);
	
		
		// Utilização do for-each
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for (String i : cars) {
			System.out.println (i);
		}
		
		// Populando um Array
		for (int i=0; i<5; i++) {
			System.out.println ("\n Entre com uma nota: ");
			nota[i] = leia.nextFloat();
		}
		
		// Apresentando um Array
		for(int i=0; i<5; i++) {
			System.out.println ("Nota " +i+1+ "=" +nota[i]);			
		}
	}
}
