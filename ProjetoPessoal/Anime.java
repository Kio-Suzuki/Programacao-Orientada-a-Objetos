//Nome Allisson Akio Suzuki - RA: 2476495

public class Anime extends ConteudoStreaming{

	private int temporadas;
	private int episodios;

	public Anime(){
		temporadas = 0;
		episodios = 0;
	}

	public int getTemporadas(){
		return temporadas;
	}

	public int getEpisodios(){
		return episodios;
	}

	public void setTemporadas(int temporadas){
		this.temporadas = temporadas;
	}

	public void setEpisodios(int episodios){
		this.episodios = episodios;
	}

	private int totalEpi(int temporadas, int episodios){
		int total = (getTemporadas()*getEpisodios());
		return total;
	} 
}