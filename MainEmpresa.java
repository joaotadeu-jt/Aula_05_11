package aula_05_11;

public class MainEmpresa {

	public static void main(String[] args) {
		
		Departamento departamento = new Departamento ("Inovação");
		Empresa empresa = new Empresa ("Ceitec", departamento);
		
		System.out.println("Empresa: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());

	}

}
