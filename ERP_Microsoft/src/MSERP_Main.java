
public class MSERP_Main {
	public static void main(String[] args) {
		
		Interface_ERPMicrosoft inter;
		inter = new CoreSystem();
		
		inter.MS_erpInvoiceDecoder(" * INVOICE * ");
	}

}
