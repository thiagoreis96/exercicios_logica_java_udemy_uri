/*
 * 7) O sargento Silva organiza seu pelot�o em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de
soldados.

 * Um dos exerc�cios que o sargento Silva realiza com o pelot�o � o exerc�cio "girar fila", que consiste em dizer o n�mero
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o �ltimo soldado da direita vai para a
posi��o mais � esquerda.

* Voc� deve fazer um programa para ler a forma��o do pelot�o e executar o exerc�cio "girar fila".
* 
* Entrada:
* A entrada consiste em um inteiro M representando o n�mero de filas, um inteiro N representado a quantidade de soldados
por fila, as M filas de soldados (cada soldado � representado por um n�mero inteiro), e o n�mero inteiro para o exerc�cio
"girar fila".

* Sa�da:
* A sa�da cont�m a forma��o do pelot�o ap�s a execu��o do exerc�cio "girar fila".
 */

package e_matrizes;

import java.util.Scanner;

public class Mt07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] valores = new int[M][N];
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		int linha = sc.nextInt() - 1;
		int ultimaP = valores[linha][N-1];
		
		for (int j=(N-1); j>=1; j--) {
			valores[linha][j] = valores[linha][j-1];
			}
		
		valores[linha][0] = ultimaP;
		
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}