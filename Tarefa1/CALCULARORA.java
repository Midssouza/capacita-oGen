package Tarefa1;

import java.util.Scanner;

public class CALCULARORA {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num1, num2;
		int soma , subtracao, multiplicacao, divisao;
		
		System.out.print("digite o primeiro Numero : ");
		num1 = ler.nextInt();
		
		System.out.print("digite o segundo Numero : ");
		num2 = ler.nextInt();
		
		System.out.printf(" ---------- CALCULADORA DA MI ------- \n " );
		
		soma = (num1 + num2);
		System.out.printf(" *** 1 - soma = %d \n " , soma);
		
		subtracao = (num1 - num2);
		System.out.printf(" *** 2 - subtração = %d \n " , subtracao);
		
		multiplicacao = (num1 * num2);
		System.out.printf(" *** 3 - multiplicação = %d \n " , multiplicacao);
		
		divisao = (num1 / num2);
		System.out.printf(" *** 4 -divisão é %d \n " , divisao);
		
		
		
	}

}
