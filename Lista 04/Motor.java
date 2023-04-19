//Nome Allisson Akio Suzuki - RA: 2476495

public class Motor{

	private int qtdPistoes;
	private int potencia;

	
	public Motor(){
		qtdPistoes = 0;
		potencia = 0;
	}
	
	public int getQtdPistoes(){
		return qtdPistoes;
	}

	public int getPotencia(){
		return potencia;
	}

	public void setQtdPistoes(int qtdPistoes){
		this.qtdPistoes = qtdPistoes;
	}

	public void setPotencia(int potencia){
		this.potencia = potencia;
	}

}