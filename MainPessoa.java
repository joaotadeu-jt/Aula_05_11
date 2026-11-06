package aula_05_11;

public class MainPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("Fulano", 70);
		
		System.out.println("Pessoa: " + pessoa.getNome() + "\nBatimentos por minuto: " + pessoa.getCoracao());
	}

}
