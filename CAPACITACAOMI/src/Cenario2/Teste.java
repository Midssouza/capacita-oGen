package Cenario2;

public class Teste {

	public static void main(String[] args) {
	
		//instancia��o
		
		Professor profe1 = new Professor("Michelle");
		Professor profe2 = new Professor("Jo�o", "13354412669","4123654125");
		
		
		profe1.setNome("maria");
		System.out.println(profe1.getNome());
		profe1.setGenero('F');
		System.out.printf(" Oi %s %s. \n" ,profe1.mostreTratamento(),profe1.getNome() ); 
		
		profe2.setNome("Jo�o");
		System.out.printf(" Oi %s %s.  \n" ,profe1.mostreTratamento(), profe2.getNome()); 
		
		
		
			
	
	}


}
