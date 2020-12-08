package model;
/* na classe abstrata, definimos um TEMPLATE (modelo) mínimo para que os nossos futuros
 * tipos de dados (herdados) tenham como base
 */
public abstract class Veiculo {
	protected String marca;
	protected String placa;
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	
	/*  agora, o grande trunfo das classes abstratas está na possibilidade de definir
	 *  "cláusulas contratuais" de implementação de métodos, ou seja, na classe abstrata eu defino 
	 *  QUAIS MÉTODOS as classes filhas DEVEM implementar... Como implementar isso? fica a cargo de cada
	 *  classe filha
	 */
	public abstract void acelerar();
	public abstract void freiar();
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}
