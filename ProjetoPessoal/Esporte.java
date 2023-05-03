//Nome Allisson Akio Suzuki - RA: 2476495

public class Esporte extends ConteudoStreaming{

	private String esporte;
	private String liga;
	
	public Esporte(){
		esporte = "";
		liga = "";
	}

	public String getEsporte(){
		return esporte;
	}
	
	public String getLiga(){
		return liga;
	}

	public void setEsporte(String esporte){
		this.esporte = esporte;
	}

	public void setLiga(String liga){
		this.liga = liga;
	}
	
}