//Nome Allisson Akio Suzuki - RA: 2476495

public class Serie extends ConteudoStreaming{

	private int temporadas;
	private int episodios;

	public Serie(){
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

	public int totalEpi(){
		int total = (getTemporadas()*getEpisodios());
		return total;
	} 
}