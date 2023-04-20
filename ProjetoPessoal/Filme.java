//Nome Allisson Akio Suzuki - RA: 2476495

public class Filme{

	private String nome;
	private String produtora;
	private int duracao;

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
	
	public int getDuracao(){
		return duracao;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setProdutora(String produtora){
		this.produtora = produtora;
	}
	
	public void setDuracao(int duracao){
		this.duracao = duracao;
	}

}