public abstract class Streaming{

	private String nome;
	private Double assinaturaBasica;
	private Double trimestral;
	private Double anual;
	private String resolucao;

	private Serie serie;
	private Filme filme;

	public Streaming(){
		nome = "";
		assinaturaBasica = 0.0;
		trimestral = 0.0;
		anual = 0.0;
		resoluacao = "";
		serie = new Serie();
		filme = new Filme();
	}

	public String getNome(){
		return nome;
	}

	public Double getAssinaturaBasica(){
		return assinaturaBasica;
	}

	public Double getTrimestral(){
		return trimestral;
	}
	
	public Double getAnual(){
		return anual;
	}

	public Double getResolucao(){
		return resolucao;
	}

	public Serie getSerie(){
		return serie;
	}

	public Filme getFilme(){
		return filme;
	}

	public final void setNome(String nome){
		this.nome = nome;
	}

	public final void setAssinaturaBasica(Double assinaturaBasica){
		this.assinaturaBasica = assinaturaBasica;
	}

	public final void setTrimestral(Double trimestral){
		this.trimestral = trimestral;
	}

	public final void setAnual(Double anual){
		this.anual = anual;
	}

	public final void setSerie(Serie serie){
		this.serie = serie;
	}
	
	public final void setFilme(Filme filme){
		this.filme = filme;
	}

}