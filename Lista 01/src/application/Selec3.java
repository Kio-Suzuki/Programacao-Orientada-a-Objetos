package application;

import java.util.Scanner;

public class Selec3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a + " e par");
		}else {
			System.err.println(a + " e impar");
		}
		
		sc.close();
	}
}