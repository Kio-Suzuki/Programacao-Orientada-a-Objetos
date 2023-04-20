public class Filme{

	private String nome;
	private String produtora;
	private Integer duracao;

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
	
	public Integer getDuracao(){
		return duracao;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setProdutora(String produtora){
		this.produtora = produtora;
	}
	
	public void setDuracao(Integer duracao){
		this.duracao = duracao;
	}

}