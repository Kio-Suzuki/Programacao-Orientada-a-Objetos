//Nome Allisson Akio Suzuki - RA: 2476495

public final class Carga extends Veiculo implements Calc{

	private int tara;
	private int cargaMax;

	public Carga(){
		tara = 0;
		cargaMax = 0;
	}

	public int calcVel(){
		int x = (getVelocMax()*10000);
		return x;
	}

	public int calcular(){
		
		int soma = 0;

		soma += getMotor().getQtdPistoes();
		soma += getMotor().getPotencia();
		soma += getQtdRodas();
		soma += getVelocMax();
		soma += getTara();
		soma += getCargaMax();

		return soma;
	}

	public int getTara(){
		return tara;
	}

	public int getCargaMax(){
		return cargaMax;
	}

	public void setTara(int tara){
		this.tara = tara;
	}

	public void setCargaMax(int cargaMax){
		this.cargaMax = cargaMax;
	}

}