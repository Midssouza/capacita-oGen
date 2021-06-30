package ExercicioPOO;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println("Riiii riii rii");
	}
	
	public void movimentacao() {
		System.out.println( this.getNome() + " trota demais!");
	}

	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mostrar() {
		System.out.println("riii meu nome é "
				+ this.getNome()
				+ " e tenho "
				+ this.getIdade()
				+ "anos\n");
				
	}

	private String getIdade() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

