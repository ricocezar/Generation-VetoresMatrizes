package PacoteJava;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
			
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, x, pos=-1;
		
	        Scanner leia = new Scanner(System.in);
	        System.out.println("\n|2, 5, 1, 3, 4, 9, 7, 8, 10, 6|");	        
	        System.out.println("Digite um número: ");
	        num = leia.nextInt();

	        for (x = 0; x<vetor.length; x++) {
	            if (vetor[x] == num) {
	                pos = x;
	                }
	        }

	        if (pos == -1) {
	            System.out.println("Não foi encontrado!");
	        } else {
	            System.out.println("O número " + num + " está na posição " + pos + " do vetor.");

	}
	}
}
