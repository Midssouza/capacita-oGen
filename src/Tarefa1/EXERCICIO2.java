package Tarefa1;

import java.util.Scanner;

public class EXERCICIO2 {
	public static void main(String[] args) {
		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, 
		 * meses e dias. 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.print(" Digite total de dias : ");
		totalDias = sc.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.printf(" Anos: %d \n" , anos);
		System.out.printf(" Meses: %d \n" , meses);
		System.out.printf(" Dias: %d \n" , dias);
		
		
		sc.close();
		
		
		
	}
}
