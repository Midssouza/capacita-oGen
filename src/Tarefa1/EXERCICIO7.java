package Tarefa1;

import java.util.Scanner;

public class EXERCICIO7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f ;
		double x , y;
	
		System.out.print("Digite numero A: ");
		a=sc.nextInt();
		System.out.print("Digite numero B: ");
		b=sc.nextInt();
		System.out.print("Digite numero C: ");
		c=sc.nextInt();
		System.out.print("Digite numero D: ");
		d=sc.nextInt();
		System.out.print("Digite numero E: ");
		e=sc.nextInt();
		System.out.print("Digite numero F: ");
		f=sc.nextInt();
		
		x= ((c * e) - (b * f)/ (a * e) - (b * d));
		System.out.printf("Resultado de x =  %.2f \n ", x);
	
		y= ((a * f) - (c * d)/ (a * e) - (b * d));
		System.out.printf("Resultado de y = %.2f \n ", y);
	
		
		
		sc.close();
	}
	
}
