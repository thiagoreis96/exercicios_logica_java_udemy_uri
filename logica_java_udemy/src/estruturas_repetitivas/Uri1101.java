/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1101
 */

package estruturas_repetitivas;

import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int M, N, maior, menor;

		M = sc.nextInt();
		N = sc.nextInt();
		
		while (M > 0 && N > 0) {
			
			if (M > N) {
				maior = M;
				menor = N;
			} else {
				maior = N;
				menor = M;
			}
			
			int soma = 0;
			
			for (int i=menor; i<=maior; i++) {
				soma = soma + i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + soma);
			
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		sc.close();
	}
}
