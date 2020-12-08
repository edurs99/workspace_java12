package ui;

import core.BDMySQL;
import core.BDOracle;
import core.BDPostgres;
import core.InterfaceBD;

/*  Por que usar interfaces?
 * Interfaces definem o "encaixe" entre o seu sistema e os objetos que seus sitema deverá utilizar
 *  
 *  Alta coesao com baixo acoplamento
 *  
 * Se um objeto quiser se "encaixar" no seu sistema, ele deve seguir essa especificação
 * quem define este "encaixe"?  a Interface
 * 
 * o objeto? Implementa a interface para adequar-se ao seu sistema
 * 
 */

public class SistemaPrincipal {
	public static void main(String[] args) {
		
		
		// 3 passos
		// passo 1 - conectar no banco de dados
		// passo 2 - executar um comando do banco
		// passo 3 - desconectar
		
		InterfaceBD ibd;
		
		ibd = new BDOracle();  // instanciei um objeto que implementa esta interface
		
		ibd.conectar("sistema", "admin");
		ibd.executar("select * from tabela");
		ibd.desconectar("sistema");

	}

}
