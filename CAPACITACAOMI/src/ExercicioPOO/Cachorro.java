package ExercicioPOO;

public class Cachorro extends TesteAnimal{
	public void emitirSom() {
		System.out.println("Au au au au!!!");
	}
	
	public void movimentacao() {
		System.out.println( this.getNome() + " corre muito!");
	}
	
	public void mostrar() {
		
		System.out.println(" Au au au, meu é "
				+ this.getNome()
				+ " e tenho "
				+ this.getNome()
				+ " anos\n");
				
	}

	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}