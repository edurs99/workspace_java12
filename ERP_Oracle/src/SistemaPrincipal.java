
public class SistemaPrincipal {
	public static void main(String[] args) {
		InterfaceERPOracle irp;
		irp = new CoreSystem();
		
		irp.ORACLE_DecodeInvoice("***INVOICE***");
	}

}
