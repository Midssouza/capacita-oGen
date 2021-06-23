package Tarefa1;

import java.util.Scanner;

public class EXERCICIO4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		double R = 0, D, S = 0;
		
		System.out.println(" Digite o numero A : ");
		A = sc.nextInt();
		
		System.out.println(" Digite o numero B : ");
		B = sc.nextInt();
		
		System.out.println(" Digite o numero C : ");
		C = sc.nextInt();
		
		R = Math.pow((A + B),2);
		System.out.printf(" Valor de R é %.2f " , R);
		
		S = Math.pow((B + C),2);
		System.out.printf(" Valor de S é %.2f " , S);
		
		D = ((R + S)/2);
		System.out.printf(" Valor de D é %.2f " , D);
		
		
		
		
		
		
		
		sc.close();
		

	}

}
