package PooJava;

public class Automovel {
	
	// Declaração dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// Construtores fazem referencia ao objeto que serão criado na classe main
	
	// Declaração do método contrutor da classe Automovel
	
	public Automovel (String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;		
	}
	
	// Declaração dos demais metodos da classe Automovel
	//metodo void: retorno vazio
	public void imprimirinfo() {
		System.out.println("\n"+nomeProprietario+" possui um(a) "+modelo+
				" com a placa: "+placa+" e ano de fabricação:"+ano);
	}
	
	// Metodos contrutores Geter e Seter automatico

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
