public class Aluno extends Pessoa implements VerifTurma{

	private int ra;
	private String turma;

	public int getRa(){
		return ra;
	}

	public String getTurma(){
		return turma;
	}

	public void setRa(int ra){
		this.ra = ra;
	}

	public void setTurma(String turma){
		this.turma = turma;
	}

	public void mostraClasse(){
		System.out.println("\nEstou na classe Aluno");
	}

	public void mostraMae(){
		super.mostraClasse();
	}

	public void contLetra(){
		//mensagem1 = "teste";
		
		if(turma.equalsIgnoreCase("a")){
			System.out.println("\nTurma e A -> "+mensagem1);
		}else{
			System.out.println("\nTurma e B -> "+mensagem2);
		}
	}
}