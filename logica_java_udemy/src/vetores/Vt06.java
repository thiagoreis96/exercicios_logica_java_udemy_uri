/*
 * 6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
 * Depois, mostrar na tela o nome da pessoa mais velha.
 */

package vetores;

import java.util.Scanner;

public class Vt06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		
		String nome = "";
		int idade = 0;
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			if (idades[i] > idade) {
				nome = nomes[i];
				idade = idades[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + nome);

		sc.close();
	}
}
