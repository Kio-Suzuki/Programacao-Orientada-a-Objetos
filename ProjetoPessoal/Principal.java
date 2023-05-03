//Nome Allisson Akio Suzuki - RA: 2476495

import java.util.List;
import java.util.ArrayList;

public class Principal{

	private static Filme f1 = new Filme();
	private static Serie s1 = new Serie();
	private static Anime a1 = new Anime();
	private static Esporte e1 = new Esporte();

	static List<Filme> listF = new ArrayList<Filme>();
	static List<Serie> listS = new ArrayList<Serie>();
	static List<Anime> listA = new ArrayList<Anime>();
	static List<Esporte> listE = new ArrayList<Esporte>();

	private static Leitura l = new Leitura();
	public static int opc;

	public static void main(String arg[]){

		menu();

	}
	
//==========================================================================//

	public static void menu(){

		int opc = 0;

		do{
			System.out.println("\nMENU");
			System.out.println("1 - ADICIONAR CONTEUDO");
			System.out.println("2 - REMOVER CONTEUDO");
			System.out.println("3 - BUSCAR CONTEUDO");
			System.out.println("4 - BUSCAR STREAMS");
			System.out.println("5 - SAIR");
			opc = (Integer.parseInt(l.entDados("Opcao: ")));


			switch(opc){
				case 1:
					System.out.println("\nADICIONAR");
					System.out.println("1 - FILME");
					System.out.println("2 - SERIE");
					System.out.println("3 - ANIME");
					System.out.println("4 - ESPORTE");
					System.out.println("5 - VOLTAR");
					opc = (Integer.parseInt(l.entDados("Opcao: ")));
					menuAdicionar(opc);
					break;
					
				case 2:
					System.out.println("\nREMOVER");
					System.out.println("1 - FILME");
					System.out.println("2 - SERIE");
					System.out.println("3 - ANIME");
					System.out.println("4 - ESPORTE");
					System.out.println("5 - VOLTAR");
					opc = (Integer.parseInt(l.entDados("Opcao: ")));
					menuRemover(opc);
					break;
					
				case 3:
					System.out.println("\nBUSCAR POR");
					System.out.println("1 - TITULO");
					System.out.println("2 - STREAM");
					System.out.println("3 - VOLTAR");
					opc = (Integer.parseInt(l.entDados("Opcao: ")));
					menuBuscar(opc);

				case 4:
					buscarStream();
					break;
					
				case 5:
					System.exit(0);	
					break;

				default:
					System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
					opc = (Integer.parseInt(l.entDados("Opcao: ")));	
					break;		
			}

		}while(opc != 5);
	}

//==========================================================================//

	public static void menuAdicionar(int opc){

		boolean rep = true;
		String resp = "";

		switch(opc){
			case 1:
				
				while(rep){
			
					f1 = new Filme();
					System.out.println("\nFILME:");
					f1.setNome(l.entDados("NOME: "));
					f1.setGenero(l.entDados("GENERO: "));
					f1.setEstudio(l.entDados("ESTUDIO: "));
					f1.setDuracao(Integer.parseInt(l.entDados("DURACAO DO FILME (MIN): ")));
					f1.getStream().setNome(l.entDados("STREAM: "));
					listF.add(f1);
					resp = l.entDados("ADICIONAR MAIS UM FILME? (s/n): "); 
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}
				}			
				
			case 2:

				while(rep){

					s1 = new Serie();
					System.out.println("\nSERIE:");
					s1.setNome(l.entDados("NOME: "));
					s1.setGenero(l.entDados("GENERO: "));
					s1.setTemporadas(Integer.parseInt(l.entDados("NUMERO DE TEMPORADAS: ")));
					s1.setEpisodios(Integer.parseInt(l.entDados("NUMERO DE EPISODIOS: ")));
					s1.getStream().setNome(l.entDados("STREAM: "));
					listS.add(s1);
					resp = l.entDados("ADICIONAR MAIS UMA SERIE? (s/n): "); 
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}
				}			

			case 3:

				while(rep){

					a1 = new Anime();
					System.out.println("\nANIME:");
					a1.setNome(l.entDados("NOME: "));
					a1.setGenero(l.entDados("GENERO: "));
					a1.setTemporadas(Integer.parseInt(l.entDados("NUMERO DE TEMPORADAS: ")));
					a1.setEpisodios(Integer.parseInt(l.entDados("NUMERO DE EPISODIOS: ")));
					a1.getStream().setNome(l.entDados("STREAM: "));
					listA.add(a1);
					resp = l.entDados("ADICIONAR MAIS UM ANIME? (s/n): "); 
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}
				}			

			case 4:

				while(rep){
					e1 = new Esporte();
					System.out.println("\nESPORTE:");
					e1.setNome(l.entDados("NOME: "));
					e1.setGenero(l.entDados("GENERO: "));
					e1.setEsporte(l.entDados("ESPORTE: "));
					e1.setLiga(l.entDados("LIGA: "));
					e1.getStream().setNome(l.entDados("STREAM: "));
					listE.add(e1);
					resp = l.entDados("ADICIONAR MAIS UM ESPORTE? (s/n): "); 
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}
				}			

			case 5:
				menu();
				break;

			default:
				System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
				opc = (Integer.parseInt(l.entDados("Opcao: ")));	
				break;
		}
	}

//==========================================================================//

	public static void menuRemover(int opc){
		
	boolean rep = true;
		String resp = "";
		String busca = "";
		int ctrl = 0;

		switch(opc){
			case 1:

				while(rep){
					busca = l.entDados("\nTITULO: ");
					for(int i = 0; i < listF.size(); i++){
						if(busca.equalsIgnoreCase(listF.get(i).getNome())){
							listF.remove(listF.get(i));
							System.out.println("FILME REMOVIDO COM SUCESSO!");
							ctrl++;
						}
					}	
					if(ctrl == 0){
						System.out.println("FILME NAO ENCONTRADO!");
					}
					resp = l.entDados("DESEJA FAZER NOVA BUSCA? (s/n):");
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}	

				}
				
			case 2:

				while(rep){
					busca = l.entDados("\nTITULO: ");
					for(int i = 0; i < listS.size(); i++){
						if(busca.equalsIgnoreCase(listS.get(i).getNome())){
							listF.remove(listF.get(i));
							System.out.println("SERIE REMOVIDA COM SUCESSO!");
						}
					}
					resp = l.entDados("\nDESEJA REMOVER OUTRA SERIE? (s/n): "); 
						if(resp.equalsIgnoreCase("N")){
							rep = false;
							menu();
							break;
						}
				}

			case 3:

				while(rep){
					busca = l.entDados("\nTITULO: ");
					for(int i = 0; i < listA.size(); i++){
						if(busca.equalsIgnoreCase(listF.get(i).getNome())){
							listF.remove(listA.get(i));
							System.out.println("ANIME REMOVIDO COM SUCESSO!");
							ctrl++;
						}
					}	
					if(ctrl == 0){
						System.out.println("FILME NAO ENCONTRADO!");
					}
					resp = l.entDados("DESEJA FAZER NOVA BUSCA? (s/n):");
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}	

				}

			case 4:

				while(rep){
					busca = l.entDados("\nTITULO: ");
					for(int i = 0; i < listE.size(); i++){
						if(busca.equalsIgnoreCase(listE.get(i).getNome())){
							listF.remove(listA.get(i));
							System.out.println("ESPORTE REMOVIDO COM SUCESSO!");
							ctrl++;
						}
					}	
					if(ctrl == 0){
						System.out.println("FILME NAO ENCONTRADO!");
					}
					resp = l.entDados("DESEJA FAZER NOVA BUSCA? (s/n):");
					if(resp.equalsIgnoreCase("N")){
						rep = false;
						menu();
						break;
					}	

				}
					
			case 5:
				break;

			default:
				System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
				opc = (Integer.parseInt(l.entDados("Opcao: ")));	
				break;
		}
	}

//==========================================================================//

	public static void menuBuscar(int opc){

		switch(opc){
			case 1:

				buscarTitulo();
				break;
				
			case 2:

				buscarStream();
				break;
								
			case 3:
				menu();
				break;

			default:
				System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
				opc = (Integer.parseInt(l.entDados("Opcao: ")));	
				break;
		}
	}

	public static void buscarTitulo(){

		boolean rep = true;
		String resp = "";
		String busca = "";

			do{
				busca = l.entDados("\nTITULO: ");
				for(int i = 0; i < listF.size(); i++){
					if(busca.equalsIgnoreCase(listF.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listF.get(i).getNome());
						System.out.println("GENERO: "+listF.get(i).getGenero());
						System.out.println("ESTUDIO: "+listF.get(i).getEstudio());
						System.out.println("DURACAO: "+listF.get(i).getDuracao()+" MIN");
						System.out.println("DISPONIVEL EM: "+listF.get(i).getStream().getNome());
						System.out.println("==============================================================");
					}
				}	
				for(int i = 0; i < listS.size(); i++){
					if(busca.equalsIgnoreCase(listS.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listS.get(i).getNome());
						System.out.println("GENERO: "+listS.get(i).getGenero());
						System.out.println("TEMPORADAS: "+listS.get(i).getTemporadas());
						System.out.println("EPISODIOS: "+listS.get(i).getEpisodios());
						System.out.println("TOTAL DE EPISODIOS: "+listS.get(i).totalEpi());
						System.out.println("DISPONIVEL EM: "+listS.get(i).getStream().getNome());
						System.out.println("==============================================================");
					}
				}	
				for(int i = 0; i < listA.size(); i++){
					if(busca.equalsIgnoreCase(listA.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listA.get(i).getNome());
						System.out.println("GENERO: "+listA.get(i).getGenero());
						System.out.println("TEMPORADAS: "+listA.get(i).getTemporadas());
						System.out.println("EPISODIOS: "+listA.get(i).getEpisodios());
						System.out.println("DISPONIVEL EM: "+listA.get(i).getStream().getNome());
						System.out.println("==============================================================");
					}
				}	
				for(int i = 0; i < listE.size(); i++){
					if(busca.equalsIgnoreCase(listE.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("\nNOME: "+listE.get(i).getNome());
						System.out.println("GENERO: "+listE.get(i).getGenero());
						System.out.println("LIGA: "+listE.get(i).getLiga());
						System.out.println("DISPONIVEL EM: "+listE.get(i).getStream().getNome());
						System.out.println("==============================================================");
					}
				}
	
				resp = l.entDados("\nREALIZAR NOVA BUSCA? (s/n): "); 
				if(resp.equalsIgnoreCase("N")){
					rep = false;
						menu();
						break;
				}
							
			}while(rep);	

	}
	

	public static void buscarStream(){
		
		boolean rep = true;
		String resp = "";
		String busca = "";
		int contf = 0;
		int conts = 0;
		int conta = 0;
		int conte = 0;
		
			do{
				busca = l.entDados("\nSTREAM: ");
				for(int i = 0; i < listF.size(); i++){
					if(busca.equalsIgnoreCase(listF.get(i).getStream().getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listF.get(i).getNome());
						System.out.println("GENERO: "+listF.get(i).getGenero());
						System.out.println("ESTUDIO: "+listF.get(i).getEstudio());
						System.out.println("DURACAO: "+listF.get(i).getDuracao()+" MIN");
						System.out.println("==============================================================");
						contf++;
					}
				}	
				for(int i = 0; i < listS.size(); i++){
					if(busca.equalsIgnoreCase(listS.get(i).getStream().getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listS.get(i).getNome());
						System.out.println("GENERO: "+listS.get(i).getGenero());
						System.out.println("TEMPORADAS: "+listS.get(i).getTemporadas());
						System.out.println("EPISODIOS: "+listS.get(i).getEpisodios());
						System.out.println("TOTAL DE EPISODIOS: "+listS.get(i).totalEpi());
						System.out.println("==============================================================");
						conts++;
					}
				}	
				for(int i = 0; i < listA.size(); i++){
					if(busca.equalsIgnoreCase(listA.get(i).getStream().getNome())){
						System.out.println("==============================================================");
						System.out.println("NOME: "+listA.get(i).getNome());
						System.out.println("GENERO: "+listA.get(i).getGenero());
						System.out.println("TEMPORADAS: "+listA.get(i).getTemporadas());
						System.out.println("EPISODIOS: "+listA.get(i).getEpisodios());
						System.out.println("==============================================================");
						conta++;
					}
				}	
				for(int i = 0; i < listE.size(); i++){
					if(busca.equalsIgnoreCase(listE.get(i).getStream().getNome())){
						System.out.println("==============================================================");
						System.out.println("\nNOME: "+listE.get(i).getNome());
						System.out.println("GENERO: "+listE.get(i).getGenero());
						System.out.println("LIGA: "+listE.get(i).getLiga());
						System.out.println("==============================================================");
						conte++;
					}
				}
				if(contf == 0 && conts == 0 && conta == 0 && conte == 0){
					System.out.println("==============================================================");
					System.out.println("CONTEUDO INDISPONIVEL");
					System.out.println("==============================================================");
				}
		 
				System.out.println("QUANTIDADE DE FILMES DISPONIVEIS: "+contf);
				System.out.println("QUANTIDADE DE SERIES DISPONIVEIS: "+conts);
				System.out.println("QUANTIDADE DE ANIMES DISPONIVEIS: "+conta);
				System.out.println("QUANTIDADE DE ESPORTES DISPONIVEIS: "+conta);
				System.out.println("==============================================================");

				resp = l.entDados("\nREALIZAR NOVA BUSCA? (s/n): "); 
				if(resp.equalsIgnoreCase("N")){
					rep = false;
						menu();
						break;
				}
							
			}while(rep);	

	}

}
	

		