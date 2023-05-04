//Nome Allisson Akio Suzuki - RA: 2476495

public class Anime extends ConteudoStreaming implements TotalEpi{

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

	public void setTemporadas(int temporadas) throws ExceptionInt{
		
		if(temporadas > 0 && temporadas < 50){
			this.temporadas = temporadas;
		}else{
			throw new ExceptionInt();
		}
	}

	public void setEpisodios(int episodios) throws ExceptionInt{
		
		if(temporadas > 0 && temporadas < 50){
			this.episodios = episodios;
		}else{
			throw new ExceptionInt();
		}
	}

	public int totalEpi(){
		int total = (getTemporadas()*getEpisodios());
		return total;
	} 
}