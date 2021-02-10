/*
 * 2) Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor.
 * Em seguida, mostre na tela:
 * 
 * - Todos os n�meros pares.
 * - A quantidade de n�meros pares.
 */

package vetores;

import java.util.Scanner;

public class Vt02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		int contador = 0;
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				contador ++;
			}
		}
		
		System.out.println();
		System.out.println(contador);
		
		sc.close();
	}
}