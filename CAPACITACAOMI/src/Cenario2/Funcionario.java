package Cenario2;

public class Funcionario {
	private String nome ;
	private String cpf ;
	private String telefone ;
	private String endereco ;
	private char genero ;
	private String setor; 
	
	

	public Funcionario(String nome, String setor) {
		this.nome = nome;
		
	}
	
	public Funcionario(String nome, String cpf, String telefone, String setor) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.setor = setor;
	}






	public Funcionario( String nome, String cpf, String telefone, String endereco, char genero, String setor) {
		super();
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.genero = genero;
		this.setor = setor;
	}
	
	//encapsulamento 
	
		
		public String getNome() {
		return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public char getGenero() {
			return genero;
		}
		public void setGenero(char genero) {
			this.genero = genero;
		}
		
		public void getSetor() {
			return;
			
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		
		
		
		
		//métodos
		
		
		
		public String mostreTratamento() {
			 String resposta;
			
			 if(genero == 'M') {
				resposta = "Funcionario";

			}
			else if( genero == 'F') {
				resposta ="Funcionaria";
				
			}
			else {
				resposta = "Funcionarie";
			}
			 return resposta;



}
}