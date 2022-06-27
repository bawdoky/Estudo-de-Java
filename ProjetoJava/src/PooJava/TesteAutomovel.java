package PooJava;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando um objeto da classe Automovel
			Automovel auto1 = new Automovel ("Lucas","Jeep","ABD121",2021);
			auto1.imprimirinfo();
			System.out.println("\n***Transferencia de Proprietario***");
			auto1.setNomeProprietario("Nayane");
			auto1.imprimirinfo();
			System.out.println("\n***Alteração de Placa***");
			auto1.setPlaca("CDA123");
			auto1.imprimirinfo();
	}
}
