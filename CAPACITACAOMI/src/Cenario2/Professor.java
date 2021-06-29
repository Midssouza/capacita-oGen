package Cenario2;

public class Professor {

	
	private String nome ;
	private String cpf ;
	private String telefone ;
	private String endereco ;
	private char genero ;
	
	
	


	public Professor(String nome) {
		this.nome = nome;
		
	}
	

	
	
	
	
	public Professor(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}






	public Professor( String nome, String cpf, String telefone, String endereco, char genero) {
		super();
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.genero = genero;
		
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
		
		
		
		
		//métodos
		
		
		
		public String mostreTratamento() {
			 String resposta;
			
			 if(genero == 'M') {
				resposta = "Professor";

			}
			else if( genero == 'F') {
				resposta ="Professora";
				
			}
			else {
				resposta = "Professore";
			}
			 return resposta;

		
	}


		@Override
		public String toString() {
			return "Professor [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", endereco=" + endereco
					+ ", genero=" + genero + "]";
		}


		}


		
		


