import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a,b,r;
		
//		try {
			System.out.println("Digite um valor");
			a = teclado.nextInt();
			
			
			
			System.out.println("Digite outro valor");
			b = teclado.nextInt();
		
			r = a/b;
		
			System.out.println("Resultado da divisao = "+r);
		
			teclado.close();
//		}
//		
//		catch(InputMismatchException ex) {
//			System.out.println("Por favor usuário lindo... digite um numero inteiro plis!");
//		}
//		catch(ArithmeticException ex) {
//			System.out.println("Ei, o 2o valor tem que ser diferente de zero!!!!!!!!!!!!");
//		}
//		catch(Exception ex) {
//			System.out.println("Deu ruim!");
//			System.out.println("Tipo da excecao "+ex.getClass().getName());
//		}
		
		
	}

}
