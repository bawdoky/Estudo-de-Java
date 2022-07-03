package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// Crie um método que receba 3 números, informa qual é o maior e o menor número

import java.util.Scanner;

public class IndentificaNumMaiorMenor {
	public static void main(String[] args) 
	{
		// 1º Metodo com entrada de numeros não repetidos	
		
		Scanner input = new Scanner (System.in);
		//int biggest = maximum( 1,2,3 );
		
		int numero1, numero2, numero3, maior, menor;
		
		System.out.println("\n Entre com o 1º valor: ");
		numero1 = input.nextInt();
				
		System.out.println("\n Entre com o 2º valor: ");
		numero2 = input.nextInt();
		
		System.out.println("\n Entre com o 3º valor: ");
		numero3 = input.nextInt();
		
		if (numero1 < numero2 && numero2 < numero3 && numero1 < numero3 )
		{
			System.out.println("\n O maior valor é: " + numero3);
			System.out.println("\n O menor valor é: " + numero1);
		}
		
		else if (numero1 < numero2 && numero3 < numero2 && numero1 < numero3 )
		{
			System.out.println("\n O maior valor é: " + numero2);
			System.out.println("\n O menor valor é: " + numero1);
		}
		else if (numero2 < numero3 && numero3 < numero1 && numero2 < numero1 )
		{
			System.out.println("\n O maior valor é: " + numero1);
			System.out.println("\n O menor valor é: " + numero2);
		}
		
		else if (numero2 < numero1 && numero1 < numero3 && numero2 < numero3)
		{
			System.out.println("\n O maior valor é: " + numero3);
			System.out.println("\n O menor valor é: " + numero2);
		}
		
		
		else if (numero3 < numero2 && numero2 < numero1 && numero2 <= numero3)
		{
			System.out.println("\n O maior valor é: " + numero1);
			System.out.println("\n O menor valor é: " + numero3);
		}
		
		else if (numero3 < numero1 && numero1 < numero2 )
		{
			System.out.println("\n O maior valor é: " + numero2);
			System.out.println("\n O menor valor é: " + numero3);
		}
		else
		{
			System.out.println("\n Você digitou valores repetido! ");
		}
	}
		
		
	    // 2º Metodo com entrada de numeros repetidos	
	
		/*maior = numero1;
		menor = numero1;
		
		if (menor > numero2) {
			menor = numero2;
		}
		if (menor > numero3) {
			menor = numero3;
		}
		
		if (maior < numero2) {
			maior = numero2;
		}
		if (maior < numero3) {
			maior = numero3;
		}
				
		System.out.println("\n O maior valor: " + maior + "\tO menor valor: " + menor);
	}*/

}

	