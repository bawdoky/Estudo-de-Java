package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// 6. Criar método que receba 3 notas, calcular a média e dizer se a pessoa passou ou reprovou de ano,
//sendo a media minima para passar de 7.

import java.util.Scanner;

public class MediaReproveAprove {
	
	public static void main (String args []) {
		
		String name;
		int nota1, nota2, nota3, media;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nEntre com nome do aluno(a): ");
		name = input.nextLine();
		
		System.out.println("\nEntre com a primeira nota: " );
		nota1 = input.nextInt();
		
		System.out.println("\nEntre com a segunda nota: " );
		nota2 = input.nextInt();
	
		System.out.println("\nEntre com a terceira nota: " );
		nota3 = input.nextInt();
		
		media = (nota1 + nota2 + nota3)  / 3;
		
		if (media >= 7.0) {
			System.out.println("\nAluno(a): "+name+", foi aprovado(a), com média de: "+media );
		}
		else if(media < 7.00) {
			System.out.println("\nAluno(a): "+name+", foi reprovado(a), com a média de: "+media );
		}
	}

}
