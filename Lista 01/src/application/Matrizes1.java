package application;

import java.util.Scanner;

public class Matrizes1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int v[] = new int[n];
		System.out.println("O tamanho do vetor e: "+v.length);
		for(int i = 0; i < v.length; i++) {
			System.out.printf("v[%d] = ", i);
			v[i] = sc.nextInt();

		}
		
		for(int i = n-1; i >= 0; i--) {
			System.out.println("v["+i+"] = "+v[i]);
		}
		
	}

}
