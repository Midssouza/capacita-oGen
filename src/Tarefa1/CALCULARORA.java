// Desafio de fazer calculadora 

package Tarefa1;

import java.util.Scanner;

public class CALCULARORA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		int soma , subtracao, multiplicacao, divisao;
		
		System.out.print("digite o primeiro Numero : ");
		num1 = sc.nextInt();
		
		System.out.print("digite o segundo Numero : ");
		num2 = sc.nextInt();
		
		System.out.printf(" ---------- CALCULADORA DA MI ------- \n " );
		
		soma = (num1 + num2);
		System.out.printf(" *** 1 - soma = %d \n " , soma);
		
		subtracao = (num1 - num2);
		System.out.printf(" *** 2 - subtra��o = %d \n " , subtracao);
		
		multiplicacao = (num1 * num2);
		System.out.printf(" *** 3 - multiplica��o = %d \n " , multiplicacao);
		
		divisao = (num1 / num2);
		System.out.printf(" *** 4 -divis�o � %d \n " , divisao);
		
		
		sc.close();
		
		
		
	}

}
