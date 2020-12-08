package userinterface;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Fiat","ABC1234","Urbano");
		v2 = new Moto("CG125","XYZ9876","Superbike");
		
		v1.acelerar();
		v1.freiar();
		
		v2.acelerar();
		v2.freiar();
	}

}
