package aula_05_11;

public class MainCarro {

	public static void main(String[] args) {
		
		Motor motor = new Motor ("EA111 1.6");
		Carro carro = new Carro ("Gol", motor);
		
		
		System.out.println("Carro: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
		

	}

}
