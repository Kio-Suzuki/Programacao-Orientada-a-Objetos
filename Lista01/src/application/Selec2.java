package application;

import java.util.Scanner;

public class Selec2 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Valor de A: ");
		int a = sc.nextInt();
		System.out.print("Valor de B: ");
		int b = sc.nextInt();
		
		System.err.println("Menu de Opcoes:");
		System.out.println("1 - Somar (a+b)");
		System.out.println("2 - Multiplicar (a*b)");
		System.out.println("3 - Subtrair (a-b)");
		System.out.println("4 - Dividir (a/b)");
		System.out.print("Escolha uma opcoes: ");
		int c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("A soma de "+a +" + "+b +" e: "+(a+b));
			break;
		case 2:
			System.out.println("A multiplicacao de "+a +" x "+b +" e: "+(a*b));
			break;
		case 3:
			System.out.println("A subtracao de "+a +" - "+b +"e: "+(a-b));
			break;
		case 4:
			System.out.println("A divisao de "+a +" / "+b +" e: "+(a/b));
			break;
		}
		
		sc.close();
	}

}