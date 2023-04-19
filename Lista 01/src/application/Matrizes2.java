package application;

import java.util.Scanner;

public class Matrizes2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = 3, c = 3;
		int m[][] = new int[l][c];
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.printf("m[%d][%d] = ", i,j);
				m[i][j] = sc.nextInt();
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