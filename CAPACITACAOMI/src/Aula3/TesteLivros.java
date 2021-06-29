package Aula3;

public class TesteLivros {

	public static void main(String[] args) {
		// criando o objeto livro
		
		
	Livros livrin  = new Livros("Java","MiS","230","xxxx","254","300,00");	 
	 
	 livrin.ExibirDados();
	 
	 
	 Livros livrin2 = new Livros ();
	 
	 livrin2.Titulo = " Ux";
	 livrin2.Autor = "SouzaS";
	 livrin2.Num_PAginas = "250";
	 livrin2.Editora= "XXXX";
	 livrin2.ISbn = "42664126";
	 livrin2.Valor = "R$ 250,00";
	 
	 livrin2.ExibirDados();
	 
	 
	}
}
	
