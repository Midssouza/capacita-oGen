package ExercicioPOO;

public class Preguica extends TesteAnimal {

	public void emitirSom() {
		System.out.println("Zzzz Zzzz Zzz");
	}
	
	public void movimentacao() {
		System.out.println(  this.getNome() + " sobe em �rvores!");
	}
	
	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mostrar() {
		System.out.println("Oi, meu nome �  "
				+ this.getNome()
				+ " e tenho "
				+ this.getNome()
				+ " anos"); 

}
}