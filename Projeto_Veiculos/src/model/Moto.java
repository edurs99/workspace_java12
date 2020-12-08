package model;

public class Moto extends Veiculo{
	private String tipo;

	public Moto(String marca, String placa, String tipo) {
		super(marca, placa);
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+" acelera na mao PROPRORPRPRORPRPRPRORORORPORPRO");
		
	}

	@Override
	public void freiar() {
		System.out.println("Moto "+super.marca+" freia no pé LAKJSDFL;KJEQW;KLRNQW;JK");
		
	}
	
	
	
	

}
