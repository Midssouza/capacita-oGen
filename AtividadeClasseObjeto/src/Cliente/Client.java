package Cliente;

import java.util.Scanner;

public class Client {
	String nome;
	String endereco;
	String cpf;

 public Client() {
		 
	 }
 
 public Client(String nome, String endereco, String cpf) {
		super();
 
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
 }
 
		
		
 void ExibirDados() {
		System.out.println("______________________________________________");
		System.out.println(" Nome  " + nome);
		System.out.println(" Endereço " + endereco);
		System.out.println(" Cpf " + cpf);
		System.out.println("________________________________________________");
		
		 }  
}
