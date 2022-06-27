package ExercPropostosJava;

import java.util.Scanner;

public class NumeroImparOuPar {
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int numero;
		int i = 0;
		
		System.out.printf("\n Entre com um numero: ");
		numero = ler.nextInt();
		ler.nextLine(); // Limpando o Buffer de memoria
		
		//Laço condicional (SE)
		if(numero%2==i) {
			System.out.printf("\n Numero digitado: "+numero+" é PAR");
		}// Até aqui é um laço de decisão simples
		
		// Abaixo se torna um laço de decisão composto (SENÃO SE)
		else if (numero%2!=i) { //&&: E
			System.out.printf("\n Numero digitado: "+numero+" é IMPAR");
		}
		
	}
}