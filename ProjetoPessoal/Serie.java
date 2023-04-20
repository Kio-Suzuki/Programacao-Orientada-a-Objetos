public class Serie{

	private String nome;
	private Integer temporadas;
	private Integer episodios;

	public Serie(){
		nome = "";
		temporadas = 0;
		episodios = 0;
	}

	public String getNome(){
		return nome;
	}
	
	public Integer getTemporadas(){
		return temporadas;
	}

	public Integer getEpisodios(){
		return episodios;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setTemporadas(Integer temporadas){
		this.temporadas = temporadas;
	}

	public void setEpisodios(Integer episodios){
		this.episodios = episodios;
	}
}