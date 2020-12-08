package userinterface;

import model.Empreiteiro;
import model.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario f = new Empreiteiro(1234, "Empreiteiro 01 ", 3500.00);
		
		System.out.println(f.calcularSalario());
	}

}
