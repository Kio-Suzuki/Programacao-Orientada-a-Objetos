//Nome Allisson Akio Suzuki - RA: 2476495

public abstract class ConteudoStreaming{

	private String nome;
	private String genero;

	private Stream stream;

	public ConteudoStreaming(){
		nome = "";
		genero = "";
		stream = new Stream();
	}

//polimorfismo com sobrescrita

	public String apresentaStream(){
		return "\t\tCONTEUDO DISPONIVEL EM: ";
	}
		
	public String getNome(){
		return nome;
	}

	public String getGenero(){
		return genero;
	}

	public Stream getStream(){
		return stream;
	}

	public final void setNome(String nome){
		this.nome = nome;
	}

	public final void setGenero(String genero){
		this.genero = genero;
	}

	public final void setStream(Stream stream){
		this.stream = stream;
	}

}