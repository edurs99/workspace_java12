import java.util.Scanner;

public class TesteLeitura{
	public static void main(String arg[]){
	    Scanner teclado = new Scanner(System.in);

	    int id;
	    double preco;
	    String strId;
	    String strPreco;
	    String texto;

	    System.out.println("Digite um numero");
	    strId = teclado.nextLine();
	    id = Integer.parseInt(strId);
	    System.out.println("Digite um texto");
	    texto = teclado.nextLine();
	    System.out.println("Digite um double");
	    strPreco = teclado.nextLine();
	    preco = Double.parseDouble(strPreco);

	    System.out.println("Voce digitou: "+id+"/"+texto+"/"+preco);
	}
}