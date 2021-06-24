package Aula2;

import java.util.Scanner;

public class EXEMPLO3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double saldo = 100, saque, senhaAtual = 123456, senha, cont=0;

		/*for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
			}*/
		
		for( cont=0; cont<=2; cont ++) { 
		System.out.println(" Digite sua senha: ");
		senha = ler.nextDouble();
		
		
		
			if (senha == senhaAtual) {
			System.out.println("Digite o valor do saque; ");
			saque = ler.nextDouble();

			System.out.println(" Senha Correta !!   ");

			if (saque > saldo) {
				System.out.println("Saldo insuficiente");
			}

			else {

				saldo = saldo - saque;

				System.out.println("Saldo tual :" + saldo);
				System.out.println("saque realizado com sucesso!");
			}
		} 
		
		else {
			if (senha != senhaAtual) {
				System.out.println(" Senha Incorreta!!   ");
			}
		}
			
			
			System.out.println("Sua conta foi bloqueada ");
			}
		
	}


	}


