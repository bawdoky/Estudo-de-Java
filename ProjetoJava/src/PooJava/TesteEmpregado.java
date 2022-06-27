package PooJava;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado [] lista = new Empregado[3];
		
		lista[0] = new Empregado("Lucas", 5000);
		lista[1] = new Empregado("Nayane", 6000);
		lista[2] = new Empregado("Billy", 2000);
		
		for(Empregado roda:lista) {
			roda.imprimir();
		}
		
		System.out.println("\n***********************************************");
		System.out.println("Com aumento");
		for(Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}
}
