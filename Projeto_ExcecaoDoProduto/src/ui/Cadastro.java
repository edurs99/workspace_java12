package ui;

import java.util.Scanner;

import model.IsiException;
import model.Produto;

public class Cadastro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int id;
		int opcao = 1;
		String nome, strId, strPreco;
		double preco;

		do {
			try {
				Produto p = new Produto();
				System.out.print("Digite o ID do produto");
				strId = teclado.nextLine();
				id = Integer.parseInt(strId);
				p.setId(id);

				System.out.print("Digite o nome do produto");
				nome = teclado.nextLine();
				p.setNome(nome);

				System.out.print("Digite o preço do produto");
				preco = Double.parseDouble(teclado.nextLine());
				p.setPreco(preco);

				System.out.println("Produto CADASTRADO!");
				System.out.println(p);
				System.out.print("Continua? 1 - sim / 0 - nao");
				opcao = Integer.parseInt(teclado.nextLine());
			} catch (IsiException ex) {
				System.out.println("Erro na regra de negócio " + ex.getMessage());
			} catch (NumberFormatException ex) {
				System.out.println("Valor inválido!");
			} catch (Exception ex) {
				System.out.println("Erro desconhecido");
				System.out.println(ex.getClass().getName());
			}
		} while (opcao != 0);
	}

}
