public abstract class Streaming(){

	private String nome;
	private Double preco;
	private Serie serie;
	private Filme filme;

	public Streaming(){
		nome = "";
		preco = 0.0;
		serie = new Serie();
		filme = new Filme();
	}

	public String getNome(){
		return nome;
	}

	public Double getPreco(){
		return preco;
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
	
	public final void setPreco(Double preco){
		this.preco = preco;
	}

	public final void setSerie(Serie serie){
		this.serie = serie;
	}
	
	public final void setFilme(Filme filme){
		this.filme = filme;
	}

}