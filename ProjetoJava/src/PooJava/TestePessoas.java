package PooJava;

public class TestePessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando um objeto da classe Pessoas
		Pessoas pessoa1 = new Pessoas ("Maria "," ","Oliveira ");
		Pessoas pessoa2 = new Pessoas ("Lucas ","De Oliveira ","Oi ");
				
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
				
		System.out.println(pessoa2.getNomePrimeiroUltimo());
				
		System.out.println(pessoa2.getNomeMeioUltimo());
	}
}
