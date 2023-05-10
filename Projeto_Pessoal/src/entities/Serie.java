package entities;

public class Serie extends ConteudoStreaming{

	private Integer episodios;
	private Integer temporadas;
	

	public Serie(String nome, String genero, String stream, Integer episodios, Integer temporadas) {
		super(nome, genero, stream);
		this.episodios = episodios;
		this.temporadas = temporadas;
	}

	public Integer getEpisodios() {
		return episodios;
	}

	public void setEpisodios(Integer episodios) {
		this.episodios = episodios;
	}

	public Integer getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Integer temporadas) {
		this.temporadas = temporadas;
	}
		
}
