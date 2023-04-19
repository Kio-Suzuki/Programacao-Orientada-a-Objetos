public class Pessoa{

	private int rg;
	private String nome;

	public int getRg(){
		return rg;
	}

	public String getNome(){
		return nome;
	}

	public void setRg(int rg){
		this.rg = rg;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void mostraClasse(){
		System.out.println("\nEstou na classe Pessoa");
	}

}