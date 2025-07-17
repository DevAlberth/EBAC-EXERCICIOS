package ExerciciosEbac;

import java.util.Scanner;

public class Primitivos {
	
	static Scanner scan = new Scanner(System.in); // Corrigido: necessário passar System.in

    static String nome;
    static int idade;
    static String sexo;
    static String estadoCivil;
	
	public static void main(String[] args) {
		
		 System.out.println("Digite seu nome:");
	        nome = scan.nextLine();

	        System.out.println("Digite sua idade:");
	        idade = scan.nextInt();
	        scan.nextLine(); // Limpar o buffer do teclado

	        System.out.println("Digite seu sexo (Masculino/Feminino):");
	        sexo = scan.nextLine();

	        System.out.println("Digite seu estado civil (Casado/Solteiro):");
	        estadoCivil = scan.nextLine();

	        System.out.println("\nSeu perfil foi criado com sucesso!");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado civil: " + estadoCivil);
		
	}

}
