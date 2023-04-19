//Nome Allisson Akio Suzuki - RA: 2476495

public final class Passeio extends Veiculo implements Calc{
	
	private int qtdePassageiro;

	public Passeio(){
		int qtdePassageiro = 0;
	}

	public int calcVel(){
		int x = (getVelocMax()*1000);
		return x;
	}

	public int calcular(){
		
		int letras = 0;

		letras += getPlaca().length();
		letras += getMarca().length();
		letras += getModelo().length();
		letras += getCor().length();

		return letras;
	}

	public int getQtdePassageiro(){
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro){
		this.qtdePassageiro = qtdePassageiro;
	}

}