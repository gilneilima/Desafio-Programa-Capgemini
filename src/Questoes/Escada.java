package Questoes;

import java.util.Scanner;

public class Escada {

	public static Integer escada(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		return n;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("Quantos degraus deverão ter na escada? ");
		int degraus = input.nextInt();		
			escada(degraus);
		} catch (Exception e) {
			System.out.println("Digite um número válido");
		} finally {
			input.close();
		}

	}

}
