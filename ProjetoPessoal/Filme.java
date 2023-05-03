//Nome Allisson Akio Suzuki - RA: 2476495

public class Filme extends ConteudoStreaming{

	private String estudio;
	private int duracao;

	public Filme(){
		estudio = "";
		duracao = 0;
	}

	public String getEstudio(){
		return estudio;
	}
	
	public int getDuracao(){
		return duracao;
	}

	public void setEstudio(String estudio){
		this.estudio = estudio;
	}
	
	public void setDuracao(int duracao){
		this.duracao = duracao;
	}

}