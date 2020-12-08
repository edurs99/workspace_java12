package core;

public class BDMySQL implements InterfaceBD {

	@Override
	public void conectar(String bd, String usuario) {
		System.out.println("Connecting MYSQL on database "+bd+" with user "+usuario);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Loggin out from mysql on database "+bd);
		
	}

}
