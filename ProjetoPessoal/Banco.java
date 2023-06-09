//Nome Allisson Akio Suzuki - RA: 2476495

import java.util.List;
import java.util.ArrayList;

public class Banco{

	static Filme f1 = new Filme();
	static Serie s1 = new Serie();
	static Anime a1 = new Anime();
	static Esporte e1 = new Esporte();

	static List<Filme> listF = new ArrayList<Filme>();
	static List<Serie> listS = new ArrayList<Serie>();
	static List<Anime> listA = new ArrayList<Anime>();
	static List<Esporte> listE = new ArrayList<Esporte>();

	private static Leitura l = new Leitura();
	//public static int opc;

//============================================================================================//

	public static void menu(){

		int opc = 0;

		do{
			System.out.println("\nMENU");
			System.out.println("1 - ADICIONAR CONTEUDO");
			System.out.println("2 - REMOVER CONTEUDO");
			System.out.println("3 - BUSCAR CONTEUDO");
			System.out.println("4 - SAIR");
			try{
				opc = (Integer.parseInt(l.entDados("Opcao: ")));
			}catch(NumberFormatException e) {
   				 System.out.println("UTILIZE APENAS NUMEROS");
			}
			
			switch(opc){
				case 1:
					System.out.println("\nADICIONAR");
					System.out.println("1 - FILME");
					System.out.println("2 - SERIE");
					System.out.println("3 - ANIME");
					System.out.println("4 - ESPORTE");
					System.out.println("5 - VOLTAR");
					try{
						opc = (Integer.parseInt(l.entDados("Opcao: ")));
					}catch(NumberFormatException e) {
   						System.out.println("UTILIZE APENAS NUMEROS");
						menu();
					}
					menuAdicionar(opc);
					break;
					
				case 2:
					System.out.println("\nREMOVER");
					System.out.println("1 - FILME");
					System.out.println("2 - SERIE");
					System.out.println("3 - ANIME");
					System.out.println("4 - ESPORTE");
					System.out.println("5 - VOLTAR");
					try{
						opc = (Integer.parseInt(l.entDados("Opcao: ")));
					}catch(NumberFormatException e) {
   						System.out.println("UTILIZE APENAS NUMEROS");
						menu();
					}
					menuRemover(opc);
					break;
					
				case 3:
					System.out.println("\nBUSCAR POR");
					System.out.println("1 - TITULO");
					System.out.println("2 - GENERO");
					System.out.println("3 - STREAM");
					System.out.println("4 - VOLTAR");
					try{
						opc = (Integer.parseInt(l.entDados("Opcao: ")));
					}catch(NumberFormatException e) {
   						System.out.println("UTILIZE APENAS NUMEROS");
						menu();
					}
					menuBuscar(opc);

				case 4:
					System.exit(0);	
					break;

				default:
					System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
					break;		
			}

		}while(opc != 4);
	}

//============================================================================================//

	public static void menuAdicionar(int opc){

		boolean rep = true;
		String resp = "";

		switch(opc){
			case 1:
				while(rep){
					f1 = new Filme();
					System.out.println("\nFILME:");
					f1.setNome(l.entDados("NOME: "));
					for(int i = 0; i < listF.size(); i++){
						if(f1.getNome().equalsIgnoreCase(listF.get(i).getNome())){
							System.out.println("FILME JA CADASTRADO, RETORNANDO AO MENU!");
							menu();
						}
					}
					f1.setGenero(l.entDados("GENERO: "));
					f1.setEstudio(l.entDados("ESTUDIO: "));
					try{
						f1.setDuracao(Integer.parseInt(l.entDados("DURACAO DO FILME (MIN): ")));
					}
					catch(ExceptionInt d){
						d.exceptionMsgD();
						f1 = d.dur(f1);	
					}
					catch(NumberFormatException nfe){
						System.out.println("\nDEVE RECEBER UM NUMERO");
					}

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
					for(int i = 0; i < listS.size(); i++){
						if(s1.getNome().equalsIgnoreCase(listS.get(i).getNome())){
							System.out.println("SERIE JA CADASTRADA, RETORNANDO AO MENU!");
							menu();
						}
					}
					s1.setGenero(l.entDados("GENERO: "));
					try{
						s1.setTemporadas(Integer.parseInt(l.entDados("NUMERO DE TEMPORADAS: ")));
					}
					catch(ExceptionInt t){
						t.exceptionMsgT();
						s1 = t.temp(s1);	
					}
					catch(NumberFormatException nfe){
						System.out.println("\nDEVE RECEBER UM NUMERO");
					}
					
					try{
						s1.setEpisodios(Integer.parseInt(l.entDados("NUMERO DE EPISODIOS: ")));
					}
					catch(ExceptionInt e){
						e.exceptionMsgE();	
						s1 = e.epi(s1);
					}
					catch(NumberFormatException nfe){
						System.out.println("\nDEVE RECEBER UM NUMERO");
					}

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
					for(int i = 0; i < listA.size(); i++){
						if(a1.getNome().equalsIgnoreCase(listA.get(i).getNome())){
							System.out.println("ANIME JA CADASTRADO, RETORNANDO AO MENU!");
							menu();
						}
					}
					a1.setGenero(l.entDados("GENERO: "));
					try{
						a1.setTemporadas(Integer.parseInt(l.entDados("NUMERO DE TEMPORADAS: ")));
					}
					catch(ExceptionInt t){
						t.exceptionMsgT();
						a1 = t.temp(a1);	
					}
					catch(NumberFormatException nfe){
						System.out.println("\nDEVE RECEBER UM NUMERO");
					}

					try{
						a1.setEpisodios(Integer.parseInt(l.entDados("NUMERO DE EPISODIOS: ")));
					}
					catch(ExceptionInt e){
						e.exceptionMsgE();
						a1 = e.epi(a1);	
					}
					catch(NumberFormatException nfe){
						System.out.println("\nDEVE RECEBER UM NUMERO");
					}

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
					e1.setLiga(l.entDados("LIGA: "));
					e1.setCustoAdic(l.entDados("CUSTO ADICIONAL (s/n): "));
					if(e1.getCustoAdic().equalsIgnoreCase("S"))
						e1.setCusto(Double.parseDouble(l.entDados("VALOR: ")));
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
				break;
		}
	}

//============================================================================================//
/*
	public static void addFilme(Filme f1){

		System.out.println("\nFILME:");
		f1.setNome(l.entDados("NOME: "));
		f1.setGenero(l.entDados("GENERO: "));
		f1.setEstudio(l.entDados("ESTUDIO: "));
		try{
			f1.setDuracao(Integer.parseInt(l.entDados("DURACAO DO FILME (MIN): ")));
		}
		catch(ExceptionInt d){
			d.exceptionMsgD();
			f1 = d.dur(f1);	
		}
		catch(NumberFormatException nfe){
			System.out.println("\nDEVE RECEBER UM NUMERO");
		}

		f1.getStream().setNome(l.entDados("STREAM: "));
		listF.add(f1);
		resp = l.entDados("ADICIONAR MAIS UM FILME? (s/n): "); 
		if(resp.equalsIgnoreCase("N")){
			rep = false;
			menu();	
		}		

	}
*/
//============================================================================================//	

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
					resp = l.entDados("DESEJA REMOVER OUTRO FILME? (s/n):");
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
					resp = l.entDados("DESEJA REMOVER OUTRO ANIME? (s/n):");
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
					resp = l.entDados("DESEJA REMOVER OUTRO ESPORTE? (s/n):");
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

//============================================================================================//

	public static void menuBuscar(int opc){

		switch(opc){
			case 1:
				buscarTitulo();
				break;
				
			case 2:
				buscarGenero();
				break;
					
			case 3:
				buscarStream();
				break;
			
			case 4:
				menu();
				break;

			default:
				System.out.println("OPCAO INVALIDA, ESCOLHA NOVAMENTE");
				opc = (Integer.parseInt(l.entDados("Opcao: ")));	
				break;
		}
	}

//============================================================================================//

	public static void buscarTitulo(){

		boolean rep = true;
		String resp = "";
		String busca = "";
		int contf = 0;
		int conts = 0;
		int conta = 0;
		int conte = 0;

			do{
				busca = l.entDados("\nTITULO: ");
				for(int i = 0; i < listF.size(); i++){
					if(busca.equalsIgnoreCase(listF.get(i).getNome())){
						System.out.println("=====================================================");
						System.out.println(listF.get(i).toString());
						System.out.println("=====================================================");
						contf++;
					}
				}	
				for(int i = 0; i < listS.size(); i++){
					if(busca.equalsIgnoreCase(listS.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("\t\tNOME: "+listS.get(i).getNome());
						System.out.println("\t\tGENERO: "+listS.get(i).getGenero());
						System.out.println("\t\tTEMPORADAS: "+listS.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listS.get(i).getEpisodios());
						System.out.println("\t\tTOTAL DE EPISODIOS: "+listS.get(i).totalEpi());
						System.out.println("\t\tDISPONIVEL EM: "+listS.get(i).getStream().getNome());
						System.out.println("==============================================================");
						conts++;
					}
				}	
				for(int i = 0; i < listA.size(); i++){
					if(busca.equalsIgnoreCase(listA.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("\t\tNOME: "+listA.get(i).getNome());
						System.out.println("\t\tGENERO: "+listA.get(i).getGenero());
						System.out.println("\t\tTEMPORADAS: "+listA.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listA.get(i).getEpisodios());
						System.out.println("\t\tDISPONIVEL EM: "+listA.get(i).getStream().getNome());
						System.out.println("==============================================================");
						conta++;
					}
				}	
				for(int i = 0; i < listE.size(); i++){
					if(busca.equalsIgnoreCase(listE.get(i).getNome())){
						System.out.println("==============================================================");
						System.out.println("\t\tNOME: "+listE.get(i).getNome());
						System.out.println("\t\tGENERO: "+listE.get(i).getGenero());
						System.out.println("\t\tLIGA: "+listE.get(i).getLiga());
						System.out.println("\t\tDISPONIVEL EM: "+listE.get(i).getStream().getNome());
						System.out.println("==============================================================");
						conts++;
					}
				}

				if(contf == 0 && conts == 0 && conta == 0 && conte == 0){
					System.out.println("==============================================================");
					System.out.println("\t\tCONTEUDO INDISPONIVEL");
					System.out.println("==============================================================");
				}
	
				contf = 0;
				conts = 0;
				conta = 0;
				conte = 0;

				resp = l.entDados("\nREALIZAR NOVA BUSCA? (s/n): "); 
				if(resp.equalsIgnoreCase("N")){
					rep = false;
					menu();
					break;
				}	
			}while(rep);	

	}
	
//============================================================================================//

	public static void buscarGenero(){

		boolean rep = true;
		String resp = "";
		String busca = "";
		int contf = 0;
		int conts = 0;
		int conta = 0;
		int conte = 0;

			do{
				busca = l.entDados("\nGENERO: ");
				for(int i = 0; i < listF.size(); i++){
					if(busca.equalsIgnoreCase(listF.get(i).getGenero())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listF.get(i).getNome());
						System.out.println("\t\tESTUDIO: "+listF.get(i).getEstudio());
						System.out.println("\t\tDURACAO: "+listF.get(i).getDuracao()+" MIN");
						System.out.println("\t\tDISPONIVEL EM: "+listF.get(i).getStream().getNome());
						System.out.println("=====================================================");
						contf++;
					}
				}	
				for(int i = 0; i < listS.size(); i++){
					if(busca.equalsIgnoreCase(listS.get(i).getGenero())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listS.get(i).getNome());
						System.out.println("\t\tTEMPORADAS: "+listS.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listS.get(i).getEpisodios());
						System.out.println("\t\tTOTAL DE EPISODIOS: "+listS.get(i).totalEpi());
						System.out.println("\t\tDISPONIVEL EM: "+listS.get(i).getStream().getNome());
						System.out.println("=====================================================");
						conts++;
					}
				}	
				for(int i = 0; i < listA.size(); i++){
					if(busca.equalsIgnoreCase(listA.get(i).getGenero())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listA.get(i).getNome());
						System.out.println("\t\tTEMPORADAS: "+listA.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listA.get(i).getEpisodios());
						System.out.println("\t\tDISPONIVEL EM: "+listA.get(i).getStream().getNome());
						System.out.println("=====================================================");
						conta++;
					}
				}	
				for(int i = 0; i < listE.size(); i++){
					if(busca.equalsIgnoreCase(listE.get(i).getGenero())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listE.get(i).getNome());
						System.out.println("\t\tLIGA: "+listE.get(i).getLiga());
						System.out.println("\t\tCUSTO ADICIONAL: R$ "+listE.get(i).getCusto());
						System.out.println("\t\tDISPONIVEL EM: "+listE.get(i).getStream().getNome());
						System.out.println("=====================================================");
						conte++;
					}
				}

				if(contf == 0 && conts == 0 && conta == 0 && conte == 0){
					System.out.println("=====================================================");
					System.out.println("\t\tCONTEUDO INDISPONIVEL");
					System.out.println("=====================================================");
				}
	
				contf = 0;
				conts = 0;
				conta = 0;
				conte = 0;

				resp = l.entDados("\nREALIZAR NOVA BUSCA? (s/n): "); 
				if(resp.equalsIgnoreCase("N")){
					rep = false;
					menu();
					break;
				}	
			}while(rep);	

	}
	
//============================================================================================//

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
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listF.get(i).getNome());
						System.out.println("\t\tGENERO: "+listF.get(i).getGenero());
						System.out.println("\t\tESTUDIO: "+listF.get(i).getEstudio());
						System.out.println("\t\tDURACAO: "+listF.get(i).getDuracao()+" MIN");
						System.out.println("=====================================================");
						contf++;
					}
				}	
				for(int i = 0; i < listS.size(); i++){
					if(busca.equalsIgnoreCase(listS.get(i).getStream().getNome())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listS.get(i).getNome());
						System.out.println("\t\tGENERO: "+listS.get(i).getGenero());
						System.out.println("\t\tTEMPORADAS: "+listS.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listS.get(i).getEpisodios());
						System.out.println("\t\tTOTAL DE EPISODIOS: "+listS.get(i).totalEpi());
						System.out.println("=====================================================");
						conts++;
					}
				}	
				for(int i = 0; i < listA.size(); i++){
					if(busca.equalsIgnoreCase(listA.get(i).getStream().getNome())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listA.get(i).getNome());
						System.out.println("\t\tGENERO: "+listA.get(i).getGenero());
						System.out.println("\t\tTEMPORADAS: "+listA.get(i).getTemporadas());
						System.out.println("\t\tEPISODIOS: "+listA.get(i).getEpisodios());
						System.out.println("=====================================================");
						conta++;
					}
				}	
				for(int i = 0; i < listE.size(); i++){
					if(busca.equalsIgnoreCase(listE.get(i).getStream().getNome())){
						System.out.println("=====================================================");
						System.out.println("\t\tNOME: "+listE.get(i).getNome());
						System.out.println("\t\tGENERO: "+listE.get(i).getGenero());
						System.out.println("\t\tLIGA: "+listE.get(i).getLiga());
						System.out.println("\t\tCUSTO ADICIONAL: R$ "+listE.get(i).getCusto());
						System.out.println("=====================================================");
						conte++;
					}
				}
				if(contf == 0 && conts == 0 && conta == 0 && conte == 0){
					System.out.println("=====================================================");
					System.out.println("\t\tCONTEUDO INDISPONIVEL");
					System.out.println("=====================================================");
				}
		 
				System.out.println("\tQUANTIDADE DE FILMES DISPONIVEIS: "+contf);
				System.out.println("\tQUANTIDADE DE SERIES DISPONIVEIS: "+conts);
				System.out.println("\tQUANTIDADE DE ANIMES DISPONIVEIS: "+conta);
				System.out.println("\tQUANTIDADE DE ESPORTES DISPONIVEIS: "+conte);
				System.out.println("=====================================================");

				contf = 0;
				conts = 0;
				conta = 0;
				conte = 0;

				resp = l.entDados("\nREALIZAR NOVA BUSCA? (s/n): "); 
				if(resp.equalsIgnoreCase("N")){
					rep = false;
					menu();
					break;
				}					
			}while(rep);	

	}
}
