package Simulacao1;

import java.util.Scanner;

public class simu1 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite num A :");
		A = leia.nextInt();
		
		System.out.println("Digite num B:");
		B = leia.nextInt();
		
		if ( A % B == 0  ||  B % A == 0) {
			System.out.println( "S�o Multiplos");
		}
		
		else {
			System.out.println(" N�o s�o Multiplos");
		}
		
		
		

		
		}

	}


