/*
 * 3) Fa�a um programa para ler dois vetores A e B, contendo N elementos cada.
 * Em seguida, gere um terceiro vetor C onde cada elemento de C � a soma dos elementos correspondentes de A e B.
 * Imprima o vetor C gerado.
 */

package vetores;

import java.util.Scanner;

public class Vt03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			C[i] = A[i] + B[i];
			System.out.print(C[i] + " ");
		}
		
		sc.close();
	}
}