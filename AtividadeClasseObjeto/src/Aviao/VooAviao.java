package Aviao;

public class VooAviao {
	static String nome;
	static String cidade;
	static String aerop;

 public VooAviao() {
		 
	 }
 
 public VooAviao(String nome, String cidade, String aerop) {
		super();
 
		this.nome = nome;
		this.cidade = cidade;
		this.aerop = aerop;
 }
 
		
		
       static void ExibirDados() {
		System.out.println("______________________________________________");
		System.out.println("_______ Nome avião : " + nome);
		System.out.println("_______ Cidade de partida :  " + cidade);
		System.out.println("_______ Aeroporto : " + aerop);
		System.out.println("________________________________________________");
		
		 }  
}

