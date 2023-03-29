public class SmartPhone{

//================================================================

	private String marca = "";
	private String modelo = "";
	private String versao = "";

	private Especificacao spec = new Especificacao();

//================================================================
	
	public Especificacao getSpec(){
		return spec;
	}

	public void setSpec(Especificacao spec){
		this.spec = spec;
	}

//================================================================

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}
	
	public String getVersao(){
		return versao;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setVersao(String versao){
		this.versao = versao;
	}

}