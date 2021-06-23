package Tarefa1;

import java.util.Scanner;

public class EXERCICIO3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tempoDuracao, hora, minutos, segundos;
		
		System.out.print(" Digite o tempo em segundos : ");
		tempoDuracao = sc.nextInt();
		
		hora = tempoDuracao / 3600;
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60;
		
		System.out.printf(" Total de Horas : %d \n" , hora);
		System.out.printf(" Total de Minutos : %d \n" , minutos);
		System.out.printf(" Total de Segundos : %d \n" , segundos);
		
		
		sc.close();

	}

}
