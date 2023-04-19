public class Inicio{
		
	public static void main(String arg[]){
		
		Aluno a = new Aluno();

		a.setRg(50);
		a.setNome("Carlos");
		a.setRa(1);
		a.setTurma("A");

		System.out.println("\nRG: "+a.getRg());
		System.out.println("\nNome: "+a.getNome());
		System.out.println("\nRA: "+a.getRa());
		System.out.println("\nTurma: "+a.getTurma());

		a.mostraClasse();
		a.mostraMae();
		a.contLetra();

	}

}