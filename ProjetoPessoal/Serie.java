//Nome Allisson Akio Suzuki - RA: 2476495

public class Serie{

	private String nome;
	private int temporadas;
	private int episodios;

	public Serie(){
		nome = "";
		temporadas = 0;
		episodios = 0;
	}

	public String getNome(){
		return nome;
	}
	
	public int getTemporadas(){
		return temporadas;
	}

	public int getEpisodios(){
		return episodios;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setTemporadas(int temporadas){
		this.temporadas = temporadas;
	}

	public void setEpisodios(int episodios){
		this.episodios = episodios;
	}
}