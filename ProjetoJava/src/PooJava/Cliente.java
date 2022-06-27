package PooJava;

import java.util.Scanner;

public class Cliente {
	
	// instanciando ler e criando variaveis comuns
	Scanner ler = new Scanner (System.in);
	double vp, vt; // vp: Valor do produto. vt: Valor total.
	
	// Criando atributos
	private String nomeCliente;
	private int codigoCliente;
	
	// Contrução do metodo contrução
	public Cliente(String nome, int codigoCliente) {
		this.nomeCliente = nome;
		this.codigoCliente = codigoCliente;
	}
	
	public Scanner getLer() {
		return ler;
	}
	
	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public double getVp() {
		return vp;
	}

	public void setVp(double vp) {
		this.vp = vp;
	}

	public double getVt() {
		return vt;
	}

	public void setVt(double vt) {
		this.vt = vt;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public double valor(double vt) {
		System.out.println("\n O valor deve ser inserido"
				+ "individualmente\nPara finalizar entre com 0 ou numero ");
		do {
			System.out.println("\n Entre com o valor: ");
			vp = ler.nextDouble();
			vt = vt + vp;
		}while(vp>0.0);
		return vt;
	}
	
	public String getInfo() {
		String info = nomeCliente + "\t\t"+ codigoCliente;
		return info;
	}
	
	public void compra() {
		System.out.printf("\nTotal: %.2f", valor(0.0));
	}	
	
}
