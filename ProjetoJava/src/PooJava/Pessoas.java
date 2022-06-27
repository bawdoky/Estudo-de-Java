package PooJava;
	// Essa é uma classe Pessoas
public class Pessoas {
	// Dar atributos para pessoas
	// Segurança para os atributos pesssoas, caracteristicas.
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	// Criando o contrutor da minha classe
	
	public Pessoas (String primeiro, String meio, String ultimo) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	// Os metodos, são ações, 
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + "" + nomesDoMeio + "" + ultimoNome;
		return nomeCompleto;
	}
	
	public String getNomePrimeiroUltimo() {
		String nomePrimeiroUltimo = primeiroNome+ "" + ultimoNome;
		return nomePrimeiroUltimo;
	}
	
	public String getNomeMeioUltimo() {
		String nomeMeioUltimo = nomesDoMeio+ "" + ultimoNome;
		return nomeMeioUltimo;
	}
	
	
	
}
