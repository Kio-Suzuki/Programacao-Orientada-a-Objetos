//Nome Allisson Akio Suzuki - RA: 2476495

public class Filme extends ConteudoStreaming{

	private String estudio;
	private int duracao;

//polimorfismo com sobrecarga

	public Filme(){
		estudio = "";
		duracao = 0;
	}

	public Filme(String estudio, int duracao){
		this.estudio = estudio;
		this.duracao = duracao;
	}

//polimorfismo com sobrescrita

	public String apresentaStream(){
		return "\t\tDISPONIVEL EM: ";
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
	
	public void setDuracao(int duracao) throws ExceptionInt{
		
		if(duracao > 0){
			this.duracao = duracao;
		}else{
			throw new ExceptionInt();
		}
	}

	public String toString(){
		return "\t\tNOME: "+getNome()+"\n\t\tGENERO: "+getGenero()+"\n\t\tESTUDIO: "+getEstudio()+"\n\t\tDURACAO: "+getDuracao()+" MIN"+"\n"+apresentaStream()+getStream().getNome();
	}

}