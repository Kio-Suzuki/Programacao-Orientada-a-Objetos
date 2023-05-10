package entities;

public class Filme extends ConteudoStreaming{
	
	private String estudio;
	private int duracao;
	
	public Filme(String nome, String genero, String stream, String estudio, int duracao) {
		super(nome, genero, stream);
		this.estudio = estudio;
		this.duracao = duracao;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
}
