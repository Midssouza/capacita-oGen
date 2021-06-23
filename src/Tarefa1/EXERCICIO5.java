package Tarefa1;

import java.util.Scanner;

public class EXERCICIO5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, mediaP, p1 = 2, p2 = 3, p3 = 5;
		
		System.out.println("Digite nota 1 :");
		n1=sc.nextDouble();
		
		System.out.println("Digite nota 2 :");
		n2=sc.nextDouble();
		
		System.out.println("Digite nota 3 :");
		n3=sc.nextDouble();
		
		mediaP = ((p1 * n1) + (p2 * n2) + (p3 * n3)) / ( p1 + p2 + p3);
		
		System.out.printf("Média da nota é %.2f : " , mediaP);
		
		sc.close();
		
		

	}

	private static double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

}
