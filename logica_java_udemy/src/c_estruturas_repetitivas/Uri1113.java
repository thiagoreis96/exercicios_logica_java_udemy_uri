/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1113
 */

package c_estruturas_repetitivas;

import java.util.Scanner;

public class Uri1113 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != Y) {
			if (X > Y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();
	}
}
