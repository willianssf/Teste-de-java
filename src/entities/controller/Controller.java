package entities.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entities.Livros;
import entities.view.View;
import frete.CalculoFrete;


@SuppressWarnings("rawtypes")
public class Controller<T> {

	private List<Livros> livro;
	View ordem = new View();

	public void mostra() {

		FileReader file;
		try {

			file = new FileReader("src\\application\\books.json");

			Gson gson = new Gson();

			Type type = new TypeToken<List<Livros>>(){}.getType();

			livro = gson.fromJson(file, type);
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void sort( List<Livros> list, int i) {
			
		if(i == 1) {
			Collections.sort(list);
		}
		else if(i == 2) {
			Collections.sort(list,Collections.reverseOrder());
		}
		for(Livros s : list) {
			System.out.println(s);
		}
	}
	
	public void buscaLivro() {
		Scanner sc = new Scanner(System.in);
		List<Livros> list = new ArrayList<>();
		
		mostra();
		String e = sc.nextLine();
		
			
			for (int i = 0; i < livro.size(); i++) {
				
				if (livro.get(i).getName().equals(e)) {
					list.add(livro.get(i));
				}
				if (livro.get(i).getSpecifications().getAuthor().equals(e)) {
					list.add(livro.get(i));
				}
				if (livro.get(i).getPrice().equals(e)) {
					list.add(livro.get(i));
				}
			}
		
			
		ordem.ordemCreDec();
			
		int opcaoOrdem = sc.nextInt();
			
		sort(list, opcaoOrdem);
		
		sc.close();
	}
	
	public void compra(Livros livro) {
		CalculoFrete taxaCompra = new CalculoFrete();
		
		taxaCompra.taxa(Double.parseDouble(livro.getPrice()));
	}
}