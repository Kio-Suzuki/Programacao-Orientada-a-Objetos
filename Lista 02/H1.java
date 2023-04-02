import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class H1 {

	public static void main(String[] args) {
		
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		
		String s1 = "";
		int a = 0;
		boolean verif = true;

		while(verif){
			System.out.print("Digite um valor: ");
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
		
		if (a % 2 == 0) {
			System.out.println(a + " e par");
		}else {
			System.err.println(a + " e impar");
		}
		
	}
}