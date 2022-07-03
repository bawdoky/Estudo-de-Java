package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 29/06/2022 */
// 8.Criar método que verifica se um ano é bissexto.

import java.util.Scanner;

public class VerificaAnoBissexto {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int ano;
		
		System.out.println("Para verificar se é bissexto.");
		System.out.println("\nDigite um ano: ");
		ano = input.nextInt();
		
		if ( ano % 400 == 0 ) {
			System.out.println(ano + " é um ano bissexto! ");
		}
		else if ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) {
			System.out.println( ano + " é um ano bissexto! ");
		}
		else {
			System.out.println( ano + " não é um ano bissexto! ");
		}
	}
}
