package PacoteJava;
//4
public class Repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x é uma variavel de loop
		int x; // Boas praticas variaveis minusculas
		int soma= 0;
		
		// Abaixo condição repetição for (PARA)
		for(x=1; x<=10; x++) {// x++ é igual x+x ou x+1, incrementa
			
			System.out.printf("\n %d", x);// %d no printf para tipo inteiro
			soma = soma + x;
		}
		System.out.printf("\n Soma total: %d", soma);
	}
}
