package ExercicioPOO;

public class Preguica extends TesteAnimal {

	public void emitirSom() {
		System.out.println("Zzzz Zzzz Zzz");
	}
	
	public void movimentacao() {
		System.out.println(  this.getNome() + " sobe em árvores!");
	}
	
	private String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mostrar() {
		System.out.println("Oi, meu nome é  "
				+ this.getNome()
				+ " e tenho "
				+ this.setIdade()
				+ " anos"); 

}

	private String setIdade() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setIdade(int i) {
		// TODO Auto-generated method stub
		
	}

	
	}
