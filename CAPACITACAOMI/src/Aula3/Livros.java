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
		System.out.println(" O Titulo é  " + Titulo);
		System.out.println(" O Autor é  " + Autor);
		System.out.println(" O numero de páginas  é  " + Num_PAginas);
		System.out.println(" O Editora  é  " + Num_PAginas);
		System.out.println(" A Editora é  " + Editora);
		System.out.println(" O Isbn é  " + ISbn);
		System.out.println(" O Valor é  " + Valor);
		System.out.println("________________________________________________");
		
	 }	
	 
}
