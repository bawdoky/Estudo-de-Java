package EncapsJava;

public class TestandoFuncionario {
// Manipula os metodos atravéz dos getters e seters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas");
		funcionario.setSalario(2500);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
	}

}
