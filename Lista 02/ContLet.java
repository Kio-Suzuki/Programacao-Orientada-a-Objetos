import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class ContLet {

	public static void main(String args[]) {
		
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		
		String frase = "";
		String letra = "";
		boolean verif = true;
		int cont = 0;
		String pos = "";

		while(verif){
			System.out.print("Digite uma frase: ");
			try{
				frase = cd.readLine();
		
				verif = false;
			}catch(IOException e){
				System.out.println("Erro de entrada");
			}catch(NumberFormatException nfe){
				System.out.println("A frase precisa ser do tipo String");
			}
		}

		verif = true;

		while(verif){
			System.out.print("Digite uma letra: ");
			try{
				letra = cd.readLine();
		
				verif = false;
			}catch(IOException e){
				System.out.println("Erro de entrada");
			}catch(NumberFormatException nfe){
				System.out.println("A letra precisa ser do tipo String");
			}
		}
		
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.substring(i, i+1).equalsIgnoreCase(letra)) {
				cont++;
				pos += i + " ";
			}
		}
		
		if(cont != 0) {
			System.out.println("A letra "+letra+" aparece "+cont+" vezes na frase nas posicoes " + pos);
		}else {
			System.out.println("A letra "+letra+" nao aparece na frase");
		}
	}
}
