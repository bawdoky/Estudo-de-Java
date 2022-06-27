package MetodosJava;

public class MetodoSobrecarregado {
	// Metodo sobrecarregado
	
		public void testeMetodosSobrecarregados() {
			System.out.printf("Salário tem número inteiro: %d \n", salario(1000));
			System.out.printf("Salário tem número Double: %f \n", salario(7.500));
		}
		public int salario(int valorInt) {
			System.out.printf("Salário com argumento inteiro %d \n",valorInt);
			return valorInt * valorInt;
		}
		public double salario(double valorDouble) {
			System.out.printf("Salário com argumento Double: %f \n",valorDouble);
			return valorDouble * valorDouble;
		}

}
