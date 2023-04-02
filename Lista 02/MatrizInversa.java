import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class MatrizInversa {

	public static void main(String args[]) {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(r);

		int l = 3, c = 3;
		int m[][] = new int[l][c];
		String s = "";
		boolean verif = true;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {

				while(verif){
				System.out.print("Digite um valor: ");
				try{
					s = cd.readLine();
					m[i][j] = Integer.parseInt(s);

					verif = false;
				}catch(IOException e){
					System.out.println("Erro de entrada");
				}catch(NumberFormatException nfe){
					System.out.println("Valor deve ser do tipo inteiro");
				}
			}

			verif = true;

			}
		}
		System.out.println();
		for(int i = l-1; i >= 0; i--) {
			for(int j = c-1; j >= 0; j--) {
				System.out.print("["+m[i][j]+"] ");
			}
			System.out.println();
		}
	}
}