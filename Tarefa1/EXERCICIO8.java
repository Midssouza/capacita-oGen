package Tarefa1;

import java.util.Scanner;

public class EXERCICIO8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		double custoConsumidor, custoFabrica, porcentagemDistribuidor, impostos;
		
		System.out.println(" Custo Fabrica: ");
		custoFabrica = sc.nextDouble();
		
		impostos = ( custoFabrica * 0.45);
		porcentagemDistribuidor = ( custoFabrica * 0.28);
		custoConsumidor = (custoFabrica + impostos + porcentagemDistribuidor );
		
		System.out.printf(" Custo  do consumidor é de: %.3f  "  , custoConsumidor );
	
	
		
		sc.close();
	}

}
