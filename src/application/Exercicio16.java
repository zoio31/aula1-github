package application;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Diagonal principal");
		
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count =0;
		System.out.println();
		System.out.print("=================");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("Numeros negativos = " + count);
		
		sc.close();
	}

}
