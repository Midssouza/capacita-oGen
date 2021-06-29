package Cenario2;

public class TesteAluno {

	public static void main(String[] args) {
		
		//instanciação
		
		Aluno alun1 = new Aluno(322155);
		Aluno alun2 = new Aluno(237,"3333333333");
		
		
		alun1.setNome("maria");
		System.out.println(alun1.getNome());
		alun1.setAnoNascimento(2000);
		alun1.setGenero('F');
		System.out.printf(" Oi %s %s, sua idade é:%d anos. \n" ,alun1.mostreTratamento(), alun1.getNome(), alun1.retorneIdade()); 
		
		alun2.setNome("maria");
		alun2.setAnoNascimento(2000);
		System.out.printf(" Oi %s , sua idade é:%d anos. " ,alun2.getNome(), alun2.retorneIdade(2030)); 
		
	

		
		
		
		
		

	}
	

}
