public final class Esportes extends Streaming{

	private Integer multitelas;
	private Double mensal;
	private Double trimestral;
	private Double anual;
	private String resolucao;
	private String esporte;
	private String ligas;

	public Esportes(){
		multitelas = 0;
		mensal = 0.0;
		trimestreal = 0.0;
		anual = 0.0;
		resolucao = "";
	}

	public Integer setMultitelas(){
		return multitelas;
	}

	public Double setMensal(){
		return mensal;
	}

	public Integer setTrimestral(){
		return trimestral;
	}

	public Integer setAnual(){
		return anual;
	}

	public Integer setResolucao(){
		return resolucao;
	}

	public Integer setEsporte(){
		return esporte;
	}

	public Integer setLigas(){
		return ligas;
	}

	public final void getMultitelas(Integer multitelas){
		this.multitelas = multitelas;
	}

	public final void getMensal(Integer mensal){
		this.mensal = mensal;
	}

	public final void getTrimestral(Integer trimestral){
		this.trimestral = trimestral;
	}

	public final void getAnual(Integer anual){
		this.anual = anual;
	}
	
	public final void getResolucao(Integer resolucao){
		this.resolucao = resolucao;
	}

}

