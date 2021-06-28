package Aula1;

import java.util.Scanner;

public class exemplo4 {
	
	public static void main(String[] args) {
		
		int idade;
		String nome;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite seu Nome = ");
		nome = sc.nextLine();
		
		System.out.println(" Digite sua idade = ");
		idade = sc.nextInt();
		
		System.out.println("Seu nome é :  " + nome);
		
		System.out.println(" A idade que vc digitou foi " + idade);
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}
}
