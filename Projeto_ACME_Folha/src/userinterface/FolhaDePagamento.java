package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		/* versao 1.0 - trabalhando com vetores sem redimensionamento
		Funcionario lista[];
		
		lista = new Funcionario[7];
		
		
		// supondo que aqui tenhamos uma rotina de recuperação de um banco de dados;
		lista[0] = new Chefe(1001, "Priscila Coelho", 8500.00, 15.00, 1200.00);
		lista[1] = new Comissionado(1002, "Jose de Almeida", 3850.00, 22.00);
		lista[2] = new Comissionado(1003, "Fabio Alcantara", 2930.00, 31.00);
		lista[3] = new Horista(1004, "Jussara Nunes", 180, 75.32);
		lista[4] = new Horista(1005, "Pedro Neves", 150, 72.47);
		lista[5] = new Empreiteiro(1006, "Waldemar Lopes", 4250.00);
		lista[6] = new Empreiteiro(1007, "Rogerio Silva", 3920.00);
		*/
		
		
		/* versao 2.0 - trabalhando com ArrayLists */
		
		// a notação <Funcionario> parametriza a minha ArrayList
		// dizendo que é possível armazenar objetos do tipo Funcionario e sua descendência
		ArrayList<Funcionario> lista; 
		
		// agora preciso instanciar
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(1001, "Priscila Coelho", 8500.00, 15.00, 1200.00));
		lista.add(new Comissionado(1002, "Jose de Almeida", 3850.00, 22.00));
		lista.add(new Comissionado(1003, "Fabio Alcantara", 2930.00, 31.00));
		lista.add(new Horista(1004, "Jussara Nunes", 180, 75.32));
		lista.add(new Horista(1005, "Pedro Neves", 150, 72.47));
		lista.add(new Empreiteiro(1006, "Waldemar Lopes", 4250.00));
		lista.add(new Empreiteiro(1007, "Rogerio Silva", 3920.00));
		
		
		
		
		System.out.println(">>>>>> F O L H A     D E   P A G A M E N T O   <<<<<<<");
		System.out.println("------------------------------------------------------");
		
		/* Esta nova modalidade de FOR, a qual chamamos de ForEACH tem um cabeçalho bastante
		 * resumido, pois serve APENAS para percorrer listas
		 * 
		 * como interpretar?
		 * 
		 * for (Funcionario f: lista) --> para cada f do tipo Funcionario pertencente à lista
		 * 
		 * isso substitui o seguinte:
		 * for (int pos=0; pos<lista.length; pos++){
		 *     Funcionario f = lista[pos];
		 *     ....
		 * }
		 * 
		 * 
		 */
		
//		lista.remove(3);
		for (int pos=0; pos < lista.size(); pos++) {
			System.out.println(lista.get(pos).getNome());
		}
		
		
		for (Funcionario f : lista) {
			System.out.printf("%8d - %-30s  R$ %8.2f%n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
		}	
		
		int idBusca = 1006;
		for (int pos=0; pos < lista.size(); pos++) {
			if (lista.get(pos).getNumRegistro() == idBusca) {
				System.out.println("O funcionario "+lista.get(pos).getNome()+" esta na posicao "+pos);
			}
		}
	}

}
