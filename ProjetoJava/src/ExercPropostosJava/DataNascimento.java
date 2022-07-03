package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// 4. Criar método que receba o ano de nascimento de uma pessoa e retorne se ela é ou
//não maior de idade

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataNascimento {

	public static void main(String[] args)
		{
			// 1º Metodo com entrada de data atual e data de nascimento. Interação "Dialog"
		
			/*int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?: "));
			int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?: "));
			int idade = anoAtual - anoNascimento;			
			
			JOptionPane.showMessageDialog(null,"Voce tem: "+idade+ " anos de idade");*/

			
			// 2º Metodo com data atual do sistema e entrada da data de nascimento.
			Calendar calendario = GregorianCalendar.getInstance();
			int anoAtual = calendario.get(Calendar.YEAR);
					
			Scanner input = new Scanner(System.in);
			System.out.println("Em que Ano você nasceu?: ");
			int anoNascimento = input.nextInt();
			System.out.println("Voce tem: " + (anoAtual - anoNascimento) + "anos");
			
		}
}
