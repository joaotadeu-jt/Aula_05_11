package aula_05_11;

public class Carro {
	private String modelo;
	private Motor motor; //Agregação
	
	public Carro(String modelo, Motor motor) {
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
