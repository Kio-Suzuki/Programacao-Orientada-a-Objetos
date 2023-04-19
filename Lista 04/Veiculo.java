//Nome Allisson Akio Suzuki - RA: 2476495

public abstract class Veiculo{

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private int velocMax;

	private Motor motor;

	private String dataCadastro;

//=====================================================

	public Veiculo(){
		placa = "";
		marca = "";
		modelo = "";
		cor = "";
		qtdRodas = 0;
		velocMax = 0;
		motor = new Motor();
		dataCadastro = "";
	}
		
	public String getPlaca(){
		return placa;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}
	
	public String getCor(){
		return cor;
	}

	public int getQtdRodas(){
		return qtdRodas;
	}

	public int getVelocMax(){
		return velocMax;
	}

	public Motor getMotor(){
		return motor;
	}

	public String getDataCadastro(){
		return dataCadastro;
	}

	public final void setPlaca(String placa){
		this.placa = placa;
	}

	public final void setMarca(String marca){
		this.marca = marca;
	}

	public final void setModelo(String modelo){
		this.modelo = modelo;
	}

	public final void setCor(String cor){
		this.cor = cor;
	}

	public final void setQtdRodas(int qtdRodas){
		this.qtdRodas = qtdRodas;
	}
	
	public final void setVelocMax(int velocMax){
		this.velocMax = velocMax;
	}

	public final void setMotor(Motor motor){
		this.motor = motor;
	}

	public final void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}

	public abstract int calcVel();

}

	

