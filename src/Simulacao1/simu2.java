package Simulacao1;

import java.util.Scanner;


public class simu2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */
		
		 Scanner ler = new Scanner (System.in);
		 
		 int senha;
		  
		 System.out.println(" Digite sua senha : ");
		 senha =ler.nextInt();
		 
		 while( senha != 2002) {
			 System.out.println(" Senha Invalida ");
			 senha= ler.nextInt();
		 }
		 
		 System.out.println(" Acesso Permitido! ");

	}

}
