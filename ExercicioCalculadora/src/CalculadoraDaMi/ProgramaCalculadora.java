package CalculadoraDaMi;

import java.util.Scanner;

public class ProgramaCalculadora {
	public static void main(String[] args){

Scanner leia = new Scanner(System.in);
		
		//variaveis
		int tentativas=-1;
		String senha;
		String nome;
		char tipo;
		char op;
		char continua=' ';
		double valor1=0.00, valor2=0.00, resultado=0.00;
		
		//CASO A SENHA ESTEJA CORRETA
		if (tentativas != 3) {
			do {
				System.out.println("+-----MI-CALCULE----------------+");
				System.out.println("| L - Liga                      |");
				System.out.println("| D - Desliga                   |");
				System.out.println("| 1 - Soma                      |");
				System.out.println("| 2 - Subtra��o                 |");
				System.out.println("| 3 - Multiplica��o             |");
				System.out.println("| 4 - Divis�o                   |");
				System.out.println("| 5 - Sair                      |");
				System.out.println("+-------------------------------+");
				System.out.print  ("Digite o numero de sua op��o: ");
				op = leia.next().charAt(0);
				switch (op) {
					case '1':
					{
						System.out.print("Digite o primeiro valor: ");
						valor1 = leia.nextDouble();
						System.out.print("Digite o segundo valor: ");
						valor2 = leia.nextDouble();
						resultado = valor1+valor2;
						System.out.printf("%.2f + %.2f = %.2f\n",valor1,valor2,resultado);
					}
					break;
					case '2':
					{
						System.out.print("Digite o primeiro valor: ");
						valor1 = leia.nextDouble();
						System.out.print("Digite o segundo valor: ");
						valor2 = leia.nextDouble();
						resultado = valor1-valor2;
						System.out.printf("%.2f - %.2f = %.2f\n",valor1,valor2,resultado);
					}
					break;
					case '3':
					{
						System.out.print("Digite o primeiro valor: ");
						valor1 = leia.nextDouble();
						System.out.print("Digite o segundo valor: ");
						valor2 = leia.nextDouble();
						resultado = valor1*valor2;
						System.out.printf("%.2f * %.2f = %.2f\n",valor1,valor2,resultado);
					}
					break;
					case '4':
					{
						System.out.print("Digite o primeiro valor: ");
						valor1 = leia.nextDouble();
						System.out.print("Digite o segundo valor: ");
						valor2 = leia.nextDouble();
						resultado = valor1/valor2;
						System.out.printf("%.2f / %.2f = %.2f\n",valor1,valor2,resultado);
					}
					break;
					case '5': {
						continua ='N';
					break;
					}
				}
				if (op != '5') {
					System.out.println("Continuar s/n:");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} while (continua == 'S');
			
		}
		else {
		
			System.out.println("Tente encontra a senha e retorne!!!");
		}
		
		System.out.println("FIM DE PROGRAMA!!!");
		
		
		}
}
		
		


