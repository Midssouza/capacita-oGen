package Cenario2;

public class TesteFuncion�rio {

	public static void main(String[] args) {
	
		//instancia��o
		
				Funcionario fun1 = new Funcionario("Michelle", "Tecnologia");
				Funcionario fun2 = new Funcionario("Jo�o","4136612265", "5121533","ADM");
				
				
				fun1.setNome("Michelle");
				System.out.println(fun1.getNome());
				fun1.setGenero('F');
				fun1.setSetor("Tecnologia");
				System.out.printf(" Oi %s %s, . \n" ,fun1.mostreTratamento(), fun1.getNome()); 
				
				
				fun2.setNome("Jo�o");
				fun2.setSetor("ADM");
				System.out.printf(" Oi %s %s, . \n" ,fun2.mostreTratamento(), fun2.getNome());  
				
				
				
					
	}

}
