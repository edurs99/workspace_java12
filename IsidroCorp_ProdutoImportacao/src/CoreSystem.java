
public class CoreSystem implements InterfaceERPOracle, Interface_ERPMicrosoft, InterfaceERPSAP {
	
	public void tropicalizarInvoice(String conteudoInvoice) {
		System.out.println("------PRODUTO ISIDROCORP------");
		System.out.println(" Invoice sendo decodificada...");
		System.out.println(conteudoInvoice+"..............");
		System.out.println("----------FIM-----------------");
	}

	@Override
	public void ORACLE_DecodeInvoice(String invoice) {
		tropicalizarInvoice(invoice);
		
	}

	@Override
	public void MS_erpInvoiceDecoder(String invoice) {
		// TODO Auto-generated method stub
		tropicalizarInvoice(invoice);
	}

	@Override
	public void SAP_importInvoice(String invoice) {
		// TODO Auto-generated method stub
		tropicalizarInvoice(invoice);
	}

}
