package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		float n1, n2, n3, n4, n5, media;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		n1 = n1 / 10 * 2;
		n2 = n2 / 10 * 3;
		n3 = n3 / 10 * 4;
		n4 = n4 / 10 * 1;
		
		media = n1 + n2 + n3 + n4;
		
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			n5 = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", n5);
			media = (media + n5) / 2;
			
			if (media < 5) {
				System.out.println("Aluno reprovado.");
			} else {
				System.out.println("Aluno aprovado.");
			}
			
			System.out.printf("Media final: %.1f%n", media);
		}
		
		sc.close();
	}
}