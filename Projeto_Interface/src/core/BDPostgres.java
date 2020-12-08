package core;

public class BDPostgres implements InterfaceBD {

	@Override
	public void conectar(String bd, String usuario) {
		System.out.println("PGConnect "+usuario+"@"+bd);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("pgsql>"+comando);
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("PGDisconnect "+bd);
		
	}

}
