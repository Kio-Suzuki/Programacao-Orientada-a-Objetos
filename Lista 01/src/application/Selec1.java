package application;

import java.util.Scanner;

public class Selec1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		int a = sc.nextInt();
		System.out.print("Valor de B: ");
		int b = sc.nextInt();
		
		if (a > b){
			System.out.println("A e maior que B");
		}else if (a == b) {
			System.out.println("A e igual B");
		}else {
			System.out.println("A e menor que B");
		}
		
		sc.close();
		
	}
}