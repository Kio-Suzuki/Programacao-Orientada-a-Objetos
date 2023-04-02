import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class G1 {

	public static void main(String args[]) {
		
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int a = 0;
		int b = 0;
		int opt = 0;
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
		
		System.err.println("Menu de Opcoes:");
		System.out.println("1 - Somar (a+b)");
		System.out.println("2 - Multiplicar (a*b)");
		System.out.println("3 - Subtrair (a-b)");
		System.out.println("4 - Dividir (a/b)");
		
		verif = true;

		while(verif){
			System.out.print("Escolha uma opcoes: ");
			try{
				s3 = cd.readLine();
				opt = Integer.parseInt(s3);

				verif = false;
			}catch(IOException e){
				System.out.println("Erro de entrada");
			}catch(NumberFormatException nfe){
				System.out.println("A opcao deve ser do tipo inteiro");
			}
		}

		switch(opt) {
			case 1:
				System.out.println("A soma de "+a +" + "+b +" e: "+(a+b));
				break;
			case 2:
				System.out.println("A multiplicacao de "+a +" x "+b +" e: "+(a*b));
				break;
			case 3:
				System.out.println("A subtracao de "+a +" - "+b +" e: "+(a-b));
				break;
			case 4:
				System.out.println("A divisao de "+a +" / "+b +" e: "+(a/b));
				break;
		}
		
	}

}