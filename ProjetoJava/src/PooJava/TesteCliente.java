package PooJava;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Evandro", 1234);
		System.out.println(cliente1.getInfo());
		cliente1.compra();
	}
	

}
