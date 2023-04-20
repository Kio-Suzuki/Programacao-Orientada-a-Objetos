//Nome Allisson Akio Suzuki - RA: 2476495

public final class Basico extends Streaming{

	private int multiTelas;

	public Basico(){
		multiTelas = 0;	
	}

	public int totalEpisodios(){
		int t = (getSerie().getEpisodios() * getSerie().getTemporadas());
		return t;
	}
	
	public int getMultiTelas(){
		return multiTelas;
	}

	public final void setMultiTelas(int multiTelas){
		this.multiTelas = multiTelas;
	}

}