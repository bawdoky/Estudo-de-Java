package MetodosJava;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro(); //instanciando novo objeto (meuCarro)
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.ligar();
		meuCarro.acelera(40);
		
		System.out.println("Velocidade Atual:"+meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
		
		System.out.println("Marcha:"+meuCarro.pegaMarcha());
	}

}
