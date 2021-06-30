package ExercicioPOO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Rex");
		cachorro.setIdade(2);
		
		cavalo.setNome("Fox");
		cavalo.setIdade(10);
		
		preguica.setNome("Socego");
		preguica.setIdade(4);
		
		cachorro.movimentacao();
		cachorro.emitirSom();
		cachorro.mostrar();
		
		cavalo.movimentacao();
		cavalo.emitirSom();
		cavalo.mostrar();
		
		preguica.movimentacao();
		preguica.emitirSom();
		preguica.mostrar();
	}

	}


