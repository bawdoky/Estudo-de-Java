package PacoteJava;
//6
import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner: para ler dados; new: estanciando; In: entrada de dados
		Scanner ler = new Scanner (System.in);
		
		int idade;
		System.out.printf("\n Entre com a sua idade: ");
		idade = ler.nextInt();// nextInt tipo inteiro
		
		// Do vai testar a idade solicitada se ela for testar e vai executar pelo menos uma vez
	
		do
		{
			System.out.printf("\n Sua idade: %d", idade);
			//Se sua idade for igual ou maior que 18
			if(idade>=18) {
				System.out.printf("\n Você é de maior...");
			}
			// Senão você é menor que 18
			else {
				System.out.printf("\n Você é de menor...");
			}
			// Solicite outra entrada para não ficar em loop infinito
			System.out.printf("\n Entre com a sua idade: ");
			idade = ler.nextInt();
			
		}while(idade>=1);
		
		System.out.printf("\n Idade inválida... ");
		
		// Contrutores são métodos especiais que são chamados automaticamente quando instâncias
		//são  criadas através da palavra-chave (new)
				
		
	}
}
