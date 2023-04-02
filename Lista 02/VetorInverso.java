import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class VetorInverso {

	public static void main(String args[]) {
		
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);

		int n = 5;
		int v[] = new int[n];
		String s = "";
		boolean verif = true;

		System.out.println("O tamanho do vetor e: "+v.length);
		
		for(int i = 0; i < v.length; i++) {

			while(verif){
				System.out.print("Digite um valor: ");
				try{
					s = cd.readLine();
					v[i] = Integer.parseInt(s);

					verif = false;
				}catch(IOException e){
					System.out.println("Erro de entrada");
				}catch(NumberFormatException nfe){
					System.out.println("Valor deve ser do tipo inteiro");
				}
			}

			verif = true;

		}
		System.out.println();
		for(int i = n-1; i >= 0; i--) {
			System.out.println("v["+i+"] = "+v[i]);
		}	
	}
}
