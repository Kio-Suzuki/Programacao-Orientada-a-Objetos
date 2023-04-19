public class Filme{

	private String nome;
	private String produtora;
	private Double duracao;

	public Filme(){
		nome = "";
		produtora = "";
		duracao = 0;
	}

	public String getNome(){
		return nome;
	}

	public String getProdutora(){
		return produtora;
	}
	
	public Double getDuracao(){
		return duracao;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setProdutora(String produtora){
		this.produtora = produtora;
	}
	
	public void setDuracao(Double duracao){
		this.duracao = duracao;
	}

}