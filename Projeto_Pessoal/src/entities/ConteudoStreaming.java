package entities;

public abstract class ConteudoStreaming {
	
	private String nome;
	private String genero;
	private String stream;
	

	public ConteudoStreaming(){
	}

	public ConteudoStreaming(String nome, String genero, String stream) {
		this.nome = nome;
		this.genero = genero;
		this.stream = stream;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
		
}


