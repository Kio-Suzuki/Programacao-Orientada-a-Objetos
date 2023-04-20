//Nome Allisson Akio Suzuki - RA: 2476495

public abstract class Streaming{

	private String nome;
	private Double assinaturaBasica;
	private String resolucao;

	private Serie serie;
	private Filme filme;

	public Streaming(){
		nome = "";
		assinaturaBasica = 0.0;
		resolucao = "";
		serie = new Serie();
		filme = new Filme();
	}

	public String getNome(){
		return nome;
	}

	public Double getAssinaturaBasica(){
		return assinaturaBasica;
	}

	public String getResolucao(){
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

	public final void setResolucao(String resolucao){
		this.resolucao = resolucao;
	}

	public final void setSerie(Serie serie){
		this.serie = serie;
	}
	
	public final void setFilme(Filme filme){
		this.filme = filme;
	}

}