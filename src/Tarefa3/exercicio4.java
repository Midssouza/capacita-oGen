package Tarefa3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LIMITE = 5;
		int idade,contador=1, pessoasCalmas=0,mulheresNervosas=0, homensAgressivos=0,outrosCalmos=0,
				pessoasNervosasMais40Anos=0,pessoasCalmasMenos18Anos=0;
		char sexo, opcao, continua = 'S'; 
		// (1-feminino / 2-masculino / 3-Outros),
			//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		
		while(continua =='S' && contador <=LIMITE) {
			System.out.print("Informe sua idade: ");
			idade = sc.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros :");
			sexo = sc.next().charAt(0);
			System.out.print("Digite:\n1 - se a pessoa era calma;\n2 - se a pessoa nervosa \n3 - se a pessoa era agressiva :");
			opcao = sc.next().charAt(0);
			if (contador != LIMITE) {
				System.out.print("Você deseja fazer nova pesquisa S-sim ou N-não? :");
				continua = sc.next().toUpperCase().charAt(0);
			}
			if (opcao == '1') {
				pessoasCalmas++;
			}
			if (sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if (sexo =='2' && opcao =='3') {
				homensAgressivos++;
			}
			if(sexo=='3' && opcao =='1') {
				outrosCalmos++;
			}
			if(opcao=='2' && idade >= 40) {
				pessoasNervosasMais40Anos++;
			}
			if (opcao=='1' && idade < 18) {
				pessoasCalmasMenos18Anos++;
			}
			
			contador++;
		}
		System.out.println("Pessoas calmas "+pessoasCalmas);
		System.out.println("Mulheres nervosas "+mulheresNervosas); 
		System.out.println("Homens agressisvos "+homensAgressivos); 
		System.out.println("Outros calmos "+outrosCalmos);
		System.out.println("Pessos nervosas acima 40 "+pessoasNervosasMais40Anos); 
		System.out.println("Pessoas calmas < 18 "+pessoasCalmasMenos18Anos);
		
		System.out.println("fim do programa!!!");
		
		sc.close();
	}



	}


