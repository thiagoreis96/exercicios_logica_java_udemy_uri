/* 
 * Para n�o poluir esta p�gina, n�o coloquei o enunciado do exerc�cio aqui.
 * Caso deseje ver o enunciado do mesmo, por favor utilize o link abaixo.
 * Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
 */

package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
	    double salario = sc.nextDouble();
	    double vendas = sc.nextDouble();

	    double total = salario + vendas * 0.15;

	    System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();
	}
}
