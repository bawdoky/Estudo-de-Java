package ExercPropostosJava;
/**	Exercício 1
	Crie uma aplicação que leia 4 valores e retorne
	no console o valor maior que zero. Inserir os numeros = {200, -190, -20, 87};
*/

import java.util.Scanner;

public class NumeroMaiorQueZero {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.printf("\n Entre com um numero: ");
		numero = ler.nextInt();
		ler.nextLine(); // Limpando o Buffer de memoria
				
		System.out.printf("\n Numero: %d", numero); //%d do prinf: Pega valor tipo inteiro
		
		//Laço condicional (SE)
		if(numero>=1) {
			System.out.printf("\n Numero:"+numero+" maior que 0");
		}// Até aqui é um laço de decisão simples
		
		// Abaixo se torna um laço de decisão composto (SENÃO SE)
		else if (numero==0) { //&&: E
			System.out.printf("\n Numero:"+numero+" igual a 0");
		}
		
		// Abaixo (SENÃO)
		else {
			System.out.printf("\n Numero:"+numero+" menor que 0");
		}
	}
}