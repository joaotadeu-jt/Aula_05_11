package aula_05_11;

public class Main {

	public static void main(String[] args) {

		Universidade universidade = new Universidade ("Unesp");
		
		Estudante estudante =  new Estudante ("Pedro", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());
	}

}
