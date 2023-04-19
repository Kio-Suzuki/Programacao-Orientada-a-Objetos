public class Especificacao{

	private String capacidade = "";
	private String cor = "";

	private SistemaOperacional so = new SistemaOperacional();

//================================================================

	public SistemaOperacional getSo(){
		return so;
	}

	public void setSo(SistemaOperacional so){
		this.so = so;
	}

//================================================================

	public String getCapacidade(){
		return capacidade;
	}

	public String getCor(){
		return cor;
	}

	public void setCapacidade(String capacidade){
		this.capacidade = capacidade;
	}

	public void setCor(String cor){
		this.cor = cor;
	}
}