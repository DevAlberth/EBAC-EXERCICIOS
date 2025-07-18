package ExerciciosEbac;

import java.util.Scanner;


public class CalculosMedia {
	
	static Scanner scan = new Scanner(System.in);
	
	
	
	private static double nota1;
	static double nota2;
	static double nota3;
	static double nota4;
	static boolean continuar;
	static String desejaContinuar;
	
	
	public static void main(String[] args) {
	
		
		
		do {
		
		System.out.println("CALCULO DE MEDIA DE NOTAS; ");
		System.out.println("DIGITE NOTA 01: ");
		
		nota1 = scan.nextDouble();
		
		System.out.println("DIGITE NOTA 02: ");
		nota2 = scan.nextDouble();
		System.out.println("DIGITE NOTA 03: ");
		nota3 = scan.nextDouble();
		System.out.println("DIGITE NOTA 04: ");
		nota4 = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("A MEDIA DAS 4 NOTAS DIVIDO POR 04 É: " + (+ nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.println("Deseja continuar? (S/N)");
		
		
		desejaContinuar = scan.nextLine();
		
		if (desejaContinuar.equalsIgnoreCase("S")) {
			continuar = true;
		} else {
			continuar = false;
		}
		
		
		
		}
		

		
		while (continuar); 
			
		System.out.println("Programa encerrado.");
		
	}

}
