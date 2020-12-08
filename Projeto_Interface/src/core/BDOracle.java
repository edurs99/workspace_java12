package core;

public class BDOracle implements InterfaceBD {

	@Override
	public void conectar(String bd, String usuario) {
		System.out.println("Oracle Service login "+usuario+"@"+bd);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle>" +comando);
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Oracle shut donw from "+bd);
		
	}

}
