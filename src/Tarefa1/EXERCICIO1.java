package Tarefa1;
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
import java.util.Scanner;

public class EXERCICIO1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println(" Digite anos: ");
		anos = sc.nextInt();
		
		System.out.println(" Digite os meses: ");
		meses = sc.nextInt();
		
		System.out.println(" Digite dias: ");
		dias = sc.nextInt();
		
		totalDias = (anos * 365 )+ (meses * 30) + dias;
		
		System.out.printf( " Total de dias é :  %d" , totalDias);
		
		
		sc.close();
		
	
		
		
	}

}
