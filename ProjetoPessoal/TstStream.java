public class TstStream{

	private static Basico b1 = new Basico();
	private static Plus p1 = new Plus();

	private static Leitura l = new Leitura();

	public static void main(String arg[]){

		System.out.println("\nSTREAMING BASICO:");

		b1.setNome(l.entDados("Nome: "));
		b1.setAssinaturaBasica(Double.parseDouble(l.entDados("Preco da assinatura basica: ")));


		System.out.println("\nSERIE:");
		b1.getSerie().setNome(l.entDados("Nome: "));
		b1.getSerie().setTemporadas(Integer.parseInt(l.entDados("Temporadas: ")));
		b1.getSerie().setEpisodios(Integer.parseInt(l.entDados("Episodios: ")));

		System.out.println("\nFILME:");
		b1.getFilme().setNome(l.entDados("Nome: "));
		b1.getFilme().setProdutora(l.entDados("Produtora: "));
		b1.getFilme().setDuracao(Integer.parseInt(l.entDados("Duracao: ")));


		System.out.println("\nSTREAMING PLUS:");

		p1.setNome(l.entDados("Nome: "));
		p1.setAssinaturaBasica(Double.parseDouble(l.entDados("Preco da assinatura basica: ")));

		//p1.setMultiTelas(Interger.parseInt(l.entDados("Telas simultaneas: ")));
		//p1.setMensal(Double.parseDouble(l.entDados("Valor mensal: ")));
		//p1.setTrimestral(Double.parseDouble(l.entDados("Valor trimestral: ")));
		//p1.setAnual(Double.parseDouble(l.entDados("Valor anual: ")));
		//p1.setResoluacao(l.entDados("Resolucao: "));
		
		System.out.println("ESPORTE: ");

		//p1.setEsporte(l.entDados("Esporte: "));
		//p1.setLigas(l.entDados("Ligas: "));


	}
	
}
	

		