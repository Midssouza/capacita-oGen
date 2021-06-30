package Calc;

import javax.swing.JOptionPane;

public class ProgCalc {

	public static void main(String[] args) {
		menuPrincipal();

	}
		
		static double valor1;
		static double valor2;
		static double resultado;
		private static Calculadora leia;
	 
	   static void menuPrincipal()
	  
	 
	    {
		   	/*Usuario use1 = new Usuario("Maria");
		  	use1.setNome("maria");
			System.out.println(use1.getNome());*/
		   
		   	System.out.println("Calculadora da MI");
			System.out.println();
			System.out.print("Digite seu nome: ");
			
		   
		   
	         Calculadora leia = new Calculadora();
	        
	         int opcao;
	         String menu = "Programa Calculadora\n\n"+
	                                "1-Somar\n"+
	                                "2-Subtrair\n"+
	                                "3-Multiplicar\n"+
	                                "4-Dividir\n"+
	                                "5-Fim\n";
	                                
	        
	        
	         opcao=1;
	         while (opcao != 7)
	         {
	               opcao = Integer.parseInt(
	                          JOptionPane.showInputDialog(null,
	                          menu," Calculadora ",
	                          JOptionPane.QUESTION_MESSAGE));
	              
	               char continua;
				switch (opcao)
	               {
	                     case 1:  //somar
	                          valor1 = lerValor("Digite o primeiro número:");
	                          valor2 = lerValor("Digite o segundo número:");
	                          resultado = leia.somar(valor1, valor2);
	                          mostrarResultado("Somar");
	                          break;
	                          
	                     case 2:  //subtrair
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                          valor2 = lerValor("Digite o segundo número:");
	                          resultado = leia.subtrair(valor1, valor2);
	                          mostrarResultado("Subtrair");
	                          break;
	                      
	                    
	                     case 3:  //multiplicar
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                          valor2 = lerValor("Digite o segundo número:");
	                          resultado = leia.multiplicar(valor1, valor2);
	                          mostrarResultado("Multiplicar");
	                          break;
	 
	                     case 4:  //dividir
	                    	 valor1 = lerValor("Digite o primeiro número:");
	                          valor2 = lerValor("Digite o segundo número:");
	                          resultado = leia.dividir(valor1, valor2);
	                          mostrarResultado("Dividir");
	                          break;
	 
	                     case 5: {
	                    	 continua ='N';
	     					break;
	     					}
	 					
	 				
	 					
	               
				  
				   static double lerValor(String mensagem)
				   {
				         double valor;
				         String strValor;
				         strValor = JOptionPane.showInputDialog(null,
				                     mensagem,"Entrada de Dados...",
				                     JOptionPane.QUESTION_MESSAGE);
				         valor = Double.parseDouble(strValor);
				         return valor;
				   }
	 
	               
				static void mostrarResultado(String operacao)
				   {
				         JOptionPane.showMessageDialog(null,
				                     String.format("Resultado da Operação de %s:\n"+
				                                "%.2f e %.2f resulta em %.2f",
				                                operacao,valor1,valor2,resultado),
				                                "Resultado",JOptionPane.PLAIN_MESSAGE);
	                    
}
}
	  
	   
	   
	   
