public class Hardware{

//================================================================

	private String categoria = "";
	private String marca = "";

	private Especificacao spec = new Especificacao();

//================================================================

	public Hardware(){
		categoria = "GPU";
		marca = "MSI";
	}

	public Hardware(String categoria, String marca){
		this.categoria = categoria;
		this.marca = marca;
	}

	public Hardware(Hardware hw){
		categoria = hw.getCategoria();
		marca = hw.getMarca();
	}
	
//================================================================

	public Especificacao getSpec(){
		return spec;
	}

	public void setSpec(Especificacao spec){
		this.spec = spec;
	}

//================================================================

	public String getCategoria(){
		return categoria;
	}

	public String getMarca(){
		return marca;
	}

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

}
	