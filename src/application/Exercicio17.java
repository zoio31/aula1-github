package application;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1 numero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 2 numero: ");
		int n2 = sc.nextInt();
		
		int[][] mat = new int[n1][n2];
		
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				if(mat[i][j] == num) {
					System.out.println("Posição: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}
