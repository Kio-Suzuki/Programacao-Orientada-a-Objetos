//Nome Allisson Akio Suzuki - RA: 2476495

public class ExceptionInt extends Exception{
		
	Leitura l = new Leitura();

	public void exceptionMsgE(){
		System.out.println("\nO NUMERO DE EPISODIOS DEVE SER MAIOR QUE 0 E MENOR QUE 100");
	}

	public Serie epi(Serie s1){
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
		return s1;
	}

	public Anime epi(Anime a1){
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
		return a1;
	}	

	public void exceptionMsgT(){
		System.out.println("\nO NUMERO DE TEMPORADAS DEVE SER MAIOR QUE 0 E MENOR QUE 50");
	}

	public Serie temp(Serie s1){
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
		return s1;
	}

	public Anime temp(Anime a1){
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
		return a1;
	}

	public void exceptionMsgD(){
		System.out.println("\nA DURACAO DE UM FILME DEVE SER MAIOR QUE 0 MINUTOS");
	}

	public Filme dur(Filme f1){
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
		return f1;
	}

}