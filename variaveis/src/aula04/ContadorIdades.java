package aula04;

import java.util.Scanner;

public class ContadorIdades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21 = 0, maior50 = 0;
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
			
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		
		leia.close();
	}
}
