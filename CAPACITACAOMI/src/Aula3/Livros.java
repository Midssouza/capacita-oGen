package Aula3;

public class Livros {

	 String Titulo;
	 String Autor;
	 String Num_PAginas;
	 String Editora;
	 String ISbn;
	 String Valor;
	 
	 
	 public Livros() {
		 
	 }
	 
	 
	 public Livros(String titulo, String autor, String num_PAginas, String editora, String iSbn, String valor) {
		super();//parametros
		
		Titulo = titulo;
		Autor = autor;
		Num_PAginas = num_PAginas;
		Editora = editora;
		ISbn = iSbn;
		Valor = valor;
	}





	void ExibirDados() {
		System.out.println("______________________________________________");
		System.out.println(" O Titulo �  " + Titulo);
		System.out.println(" O Autor �  " + Autor);
		System.out.println(" O numero de p�ginas  �  " + Num_PAginas);
		System.out.println(" O Editora  �  " + Num_PAginas);
		System.out.println(" A Editora �  " + Editora);
		System.out.println(" O Isbn �  " + ISbn);
		System.out.println(" O Valor �  " + Valor);
		System.out.println("________________________________________________");
		
	 }	
	 
}
