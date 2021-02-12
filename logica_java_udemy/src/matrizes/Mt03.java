/*
 * 3) Ler um inteiro N e uma matriz quadrada de ordem N.
 * Mostrar qual o maior elemento de cada linha, supondo n�o haver empates.
 * 
 * Entrada:
 * A entrada cont�m o n�mero N, depois os dados da matriz.
 * 
 * Sa�da:
 * A sa�da cont�m os n�meros representando o maior elemento de cada linha da matriz.
 */

package matrizes;

import java.util.Scanner;

public class Mt03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] valores = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<N; i++) {
			int maior = 0;
			for (int j=0; j<N; j++) {
				if (valores[i][j] > maior) {
					maior = valores[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}
}