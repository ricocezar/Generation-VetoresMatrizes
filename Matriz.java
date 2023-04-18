package PacoteJava;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int x,y;
		double[][] notas = new double[10][4]; // notas
        double[] medias = new double[10]; // médias

        
        // Notas
        for (x=0;x<notas.length;x++) {
            System.out.println("\nDigite as notas do Alune " + (x+1) + ":");
            for (y=0; y<notas[y].length; y++) {
                System.out.print("Nota do " + (y+1) + "º bimestre: ");
                notas[x][y] = leia.nextDouble();
            }
        }

        for (x=0; x<notas.length; x++) {
            double soma = 0;
            for (y=0; y<notas[x].length; y++) {
                soma += notas[x][y];
            }
            medias[x] = soma / notas[x].length;
        }

        // Médias de cada alune
        System.out.println("\nMédias dos alunes:");
        for (x=0; x<medias.length; x++) {
            System.out.println("Participante " + (x+1) + ": " + medias[x]);
        }
    }	
}



