//Nome Allisson Akio Suzuki - RA: 2476495

public class TstStream{

	private static Basico b1 = new Basico();
	private static Plus p1 = new Plus();

	private static Leitura l = new Leitura();

	public static void main(String arg[]){

		System.out.println("\nSTREAMING BASICO:");

		b1.setNome(l.entDados("Nome: "));
		b1.setAssinaturaBasica(Double.parseDouble(l.entDados("Preco da assinatura basica: ")));
		b1.setResolucao(l.entDados("Resolucao: "));
		b1.setMultiTelas(Integer.parseInt(l.entDados("Telas simultaneas: ")));

		System.out.println("\nCADASTRAR SERIE:");
		b1.getSerie().setNome(l.entDados("Nome: "));
		b1.getSerie().setTemporadas(Integer.parseInt(l.entDados("Temporadas: ")));
		b1.getSerie().setEpisodios(Integer.parseInt(l.entDados("Episodios: ")));

		System.out.println("\nCADASTRAR FILME:");
		b1.getFilme().setNome(l.entDados("Nome: "));
		b1.getFilme().setProdutora(l.entDados("Produtora: "));
		b1.getFilme().setDuracao(Integer.parseInt(l.entDados("Duracao: ")));

		System.out.println("\nSTREAMING PLUS:");

		p1.setNome(l.entDados("Nome: "));
		p1.setAssinaturaBasica(Double.parseDouble(l.entDados("Preco da assinatura basica: ")));
		p1.setResolucao(l.entDados("Resolucao: "));
		
		System.out.println("CADASTRAR ESPORTE: ");

		p1.setEsporte(l.entDados("Esporte: "));
		p1.setLigas(l.entDados("Ligas: "));

		System.out.println("\n=========================================================");
	
		System.out.println("\nSTREAMING BASICO:");
		System.out.println("NOME: "+b1.getNome());
		System.out.println("PRECO DA ASSINATURA BASICA - R$: "+b1.getAssinaturaBasica());
		System.out.println("RESOLUCAO: "+b1.getResolucao());
		System.out.println("TELAS SIMULTANEAS: "+b1.getMultiTelas());

		System.out.println("\nSERIE: ");
		System.out.println("NOME: "+b1.getSerie().getNome());
		System.out.println("TEMPORADAS: "+b1.getSerie().getTemporadas());
		System.out.println("EPISODIOS: "+b1.getSerie().getEpisodios());
		System.out.println("TOTAL DE EPISODIOS: "+b1.totalEpisodios());

		System.out.println("\nFILME: ");
		System.out.println("NOME: "+b1.getFilme().getNome());
		System.out.println("PRODUTORA: "+b1.getFilme().getProdutora());
		System.out.println("DURACAO: "+b1.getFilme().getDuracao());	

		System.out.println("\n=========================================================");

		System.out.println("\nSTREAMING PLUS:");
		System.out.println("NOME: "+p1.getNome());
		System.out.println("PRECO DA ASSINATURA BASICA - R$: "+p1.getAssinaturaBasica());
		System.out.println("RESOLUCAO: "+p1.getResolucao());

		System.out.println("\nESPORTES: ");
		System.out.println("ESPORTE: "+p1.getEsporte());
		System.out.println("LIGA: "+p1.getLigas());

	}
	
}
	

		