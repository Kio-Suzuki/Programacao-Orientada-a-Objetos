import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class F1 {

	public static void main(String args[]) {
		
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		
		String s1 = "";
		String s2 = "";
		int a = 0;
		int b = 0;
		boolean verif = true;

		while(verif){
			System.out.print("Valor de A: ");
			try{
				s1 = cd.readLine();
				a = Integer.parseInt(s1);

				verif = false;
			}catch(IOException e){
				System.out.println("Erro de entrada");
			}catch(NumberFormatException nfe){
				System.out.println("Valor de A deve ser do tipo inteiro");
			}
		}

		verif = true;

		while(verif){
			System.out.print("Valor de B: ");
			try{
				s2 = cd.readLine();
				b = Integer.parseInt(s2);

				verif = false;
			}catch(IOException e){
				System.out.println("Erro de entrada");
			}catch(NumberFormatException nfe){
				System.out.println("Valor de B deve ser do tipo inteiro");
			}
		}
		
		if (a > b){
			System.out.println("A e maior que B");
		}else if (a == b) {
			System.out.println("A e igual B");
		}else {
			System.out.println("A e menor que B");
		}
		
	}
}