/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1074
 */

package estruturas_repetitivas;

import java.util.Scanner;

public class Uri1074 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	
	for (int i=0; i<N; i++) {
		
		int x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("NULL");
			
		} else if (x % 2 == 0) {
			System.out.print("EVEN ");
			if (x > 0) {
				System.out.println("POSITIVE");
			} else {
				System.out.println("NEGATIVE");
			}
			
		} else {
			System.out.print("ODD ");
			if (x > 0) {
				System.out.println("POSITIVE");
			} else {
				System.out.println("NEGATIVE");
			}
		}
	}
	
	sc.close();
	}
}
