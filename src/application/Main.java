package application;

import java.io.IOException;
import java.util.Scanner;

import entities.Livros;

public class Main {

	public static void layout() {
		System.out.println("==================================");
		System.out.println("Como vc quer pesquisar seu livro: ");
		System.out.println("======1 - Nome do livro ==========");
		System.out.println("======2 - Preço ==================");
		System.out.println("======3 - Autor ==================");
		System.out.println("======0 - Encerrar ===============");
		System.out.println("==================================");
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		Livros l = new Livros();

		layout();
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			String nome = sc.next();
			l.mostra(nome);
			break;
		}
		case 2: {
			String Preco = sc.next();
			l.mostra(Preco);
			break;
		}
		case 3: {
			String Autor = sc.next();
			l.mostra(Autor);
			break;
		}
		case 0: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
	}

}
