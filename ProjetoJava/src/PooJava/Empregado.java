package PooJava;

import java.text.NumberFormat;

public class Empregado {
	 
	private String nome;
	private double salario;
	
	public Empregado (String n, double s) {
		this.setNome(n);//this.nome = n; nome = n. já para nome igual ao atributo obrigado this.nome= nome
		this.setSalario(s); // this.salario = s; salario = s
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		//salario = salario * 1
		salario *= 1 + percentual/100;
	}
	
	// Metodo
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // pega a moeda do pais
		nf.setMinimumFractionDigits(2);// formata o total de casas decimais depois da virgula
		String formatoMoeda = nf.format(salario);// formata a saida do valor
		return formatoMoeda;
	}
		
	public void imprimir() {
		System.out.println("\n"+nome+"\t\t"+"salario"+this.formatarMoeda());
	
	}
	
}
