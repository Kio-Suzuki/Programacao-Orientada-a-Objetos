package application;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
	
		System.out.print("Procar letra: ");
		String letra = sc.next();
		
		int cont = 0;
		String pos = "";
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
