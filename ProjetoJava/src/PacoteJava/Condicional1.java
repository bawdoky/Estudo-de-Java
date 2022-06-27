package PacoteJava;
//3
import java.util.*;
//import java.util.Scanner;

public class Condicional1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("\n Entre com a sua idade: ");
		idade = ler.nextInt();
		ler.nextLine(); // Limpando o Buffer de memoria
		
		System.out.printf("\n Entre com o seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("\n Seu nome: %s", nome); //%s do printf: Pega valor tipo String
		System.out.printf("\n Sua idade: %d", idade); //%d do prinf: Pega valor tipo inteiro
		
		//Laço condicional (SE)
		if(idade>=18) {
			System.out.printf("\n Você é maior de idade...");
		}// Até aqui é um laço de decisão simples
		
		// Abaixo se torna um laço de decisão composto (SENÃO SE)
		else if (idade>=1 && idade<18) { //&&: E
			System.out.printf("\n Você é menor de idade...");
		}
		// Abaixo (SENÃO)
		else {
			System.out.printf("\n Você entrou com uma idade inválida...");
		}
	}
}
