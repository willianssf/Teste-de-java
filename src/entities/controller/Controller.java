package entities.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entities.Livros;

@SuppressWarnings("rawtypes")
public class Controller {

	private List<Livros> livro;

	public <T> void mostra( T e) {
		
		Scanner sc = new Scanner(System.in);

		FileReader file;
		try {
			file = new FileReader("src\\application\\books.json");

			Gson gson = new Gson();

			Type type = new TypeToken<List<Livros>>(){}.getType();

			livro = gson.fromJson(file, type);
			
			for (int i = 0; i < livro.size(); i++) {
				
				if (livro.get(i).getName().equals(e)) {
					System.out.println(livro.get(i));
				}
				if (livro.get(i).getSpecifications().getAuthor().equals(e)) {
					System.out.println(livro.get(i));
				}

				if (livro.get(i).getPrice().equals(e)) {
					System.out.println(livro.get(i));
					
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		sc.close();
		
		sort(livro);

	}

	@SuppressWarnings("resource")
	public <T> void pesquisa() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Controller ct = new Controller();
		int option = sc.nextInt();

		sc.nextLine();
		switch (option) {
		case 1: {
			String nome = sc.nextLine();
			ct.mostra(nome);
			break;
		}
		case 2: {
			Double Preco = sc.nextDouble();
			ct.mostra(Preco);
			break;
		}
		case 3: {
			String Autor = sc.nextLine();
			ct.mostra(Autor);
			break;
		}
		case 0: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		sc.close();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> void sort ( List<Livros> list) {
		
		Collections.sort(list);
		
		for(Livros s : list) {
			System.out.println(s);
		}
	}	
}
