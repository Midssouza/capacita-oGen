package Cenario2;

public class Teste {

	public static void main(String[] args) {
	
		//instancia��o
		
		Professor profe1 = new Professor("Michelle", "Tecnologia");
		Professor profe2 = new Professor("Jo�o","4136612265", "5121533","ADM");
		
		
		profe1.setNome("maria");
		System.out.println(profe1.getNome());
		profe1.setGenero('F');
		profe1.setSetor("Tecnologia");
		System.out.printf(" Oi %s %s. \n" ,profe1.mostreTratamento(),profe1.getNome()); 
		
		profe2.setNome("Jo�o");
		profe2.setSetor("ADM");
		System.out.printf(" Oi %s %s.  \n" ,profe1.mostreTratamento(), profe2.getNome()); 
		
		
		
			
	
	}


}
