public final class Plus extends Streaming{

	private String esporte;
	private String ligas;

	public Plus(){
		esporte = "";
		ligas = "";
	}

	public String setEsporte(){
		return esporte;
	}

	public String setLigas(){
		return ligas;
	}

	
	public final void getEsporte(String esporte){
		this.esporte = esporte;
	}

	public final void getLigas(String ligas){
		this.ligas = ligas;
	}


}

