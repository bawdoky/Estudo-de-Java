 /* 11. Implemente o m�todo abaixo:

		    public int findX (String[] array) {		
		    }
		
		Dado um array de strings, retorne a posi��o da letra X. Se a letra X n�o for encontrada o m�todo deve retornar -1.
		
			Regras:
			* Cada posi��o do array tem um string com apenas uma letra
			* Todas as letras s�o mai�sculas
			
			Exemplo 1:
				array = ["A","B","X","P"]
				resultado = 2
			
			Exemplo 2:		
				array = ["X"]
				resultado = 0
			
			Exemplo 3:
				array = ["C","O","Q"]
				resultado = -1
*/
	
package ExercPropostosJava;

public class RetornaStringDeArray {

	public static void main(String[] args) {
			
	//Exemplo 1:
		String[] findX = {"A", "B", "X", "P"};
		
	//Exemplo 2:
		//String[] findX = {"X"};
	
	//Exemplo 3:
		//String[] findX = {"C", "O", "Q"};
		
		boolean busca = false;
		int posicao = 0;
		String letra = "X";
		for (int i = 0; i < findX.length; i++) {
			if(letra.equals(findX[i])) {
				posicao = i; busca = true; break;
			}
		}
		if(busca)
			System.out.println("Letra: "+ letra +"\nResultado: "+ posicao);
		else
			System.out.println("Letra: "+ letra +", n�o encontrada!"+"\nResultado = -1 ");
	}
}
