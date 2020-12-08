package model;

public class Carro extends Veiculo {
	private String estilo;

	public Carro(String marca, String placa, String estilo) {
		super(marca, placa);
		this.estilo = estilo;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro "+super.marca+" acelera no pé! VRRUUUUMMMMM!");
		
	}

	@Override
	public void freiar() {
		System.out.println("Carro "+super.marca+" freia na mão! IIIIICCCCHHHHHH");

	}
	
}
