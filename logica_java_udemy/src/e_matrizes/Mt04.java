/*
 * 4) Ler um inteiro N e uma matriz quadrada de ordem N.
 * Mostrar a soma dos elementos acima da diagonal principal.
 * 
 * Entrada:
 * A entrada cont�m o valor N, depois os dados da matriz.
 * 
 * Sa�da:
 * A sa�da cont�m a soma dos elementos acima da diagonal principal.
 */

package e_matrizes;

import java.util.Scanner;

public class Mt04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] valores = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {
				soma += valores[i][j];
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}