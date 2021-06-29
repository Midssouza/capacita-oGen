package Cenario2;

public class Aluno {
	//atributos- o que é 
	
	private int matricula ;
	private String nome ;
	private String cpf ;
	private String telefone ;
	private String endereco ;
	private char genero ;
	private int anoNascimento ;
	
	

	public Aluno(int matricula) {
		this.matricula = matricula;
		
	}
	public Aluno(int matricula, String cpf) {
		this.matricula = matricula;
		this.cpf = cpf;
		
	}
	
	
	public Aluno(int matricula, String nome, String cpf, String telefone, String endereco, char genero,
			int anoNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		
	}
	
	//encapsulamento 
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
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
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	//métodos
	
	public int retorneIdade() {
		return 2021 - anoNascimento;

	}
	
	public int retorneIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	public String mostreTratamento() {
		 String resposta;
		
		 if(genero == 'M') {
			resposta = "Aluno";

		}
		else if( genero == 'F') {
			resposta ="Aluna";
			
		}
		else {
			resposta = "Alune";
		}
		 return resposta;
			
		 //toString
	}
	

	
	

}
	
	
	
	
	
	
	
	
	


