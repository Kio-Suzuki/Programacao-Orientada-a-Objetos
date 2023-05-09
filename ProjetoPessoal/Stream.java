//Nome Allisson Akio Suzuki - RA: 2476495

public final class Stream{

	private String nome;

//polimorfismo por sobrecarga
	
	public Stream(){
	}

	public Stream(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public final void setNome(String nome){
		this.nome = nome;
	}

}