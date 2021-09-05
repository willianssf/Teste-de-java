package entities.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import entities.Livros;

@SuppressWarnings("rawtypes")
public class Controller<T> {

	private List<Livros> livro;

	@SuppressWarnings("unchecked")
	public  void mostra() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		T e = (T)sc.nextLine();
		
		FileReader file;
		try {
			List<Livros> list = new ArrayList<>();

			file = new FileReader("src\\application\\books.json");

			Gson gson = new Gson();

			Type type = new TypeToken<List<Livros>>(){}.getType();

			livro = gson.fromJson(file, type);
			
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
			sort(list);
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		sc.close();
		
	}


	public void sort( List<Livros> list) {
			
		Collections.sort(list,Collections.reverseOrder());
		
		for(Livros s : list) {
			System.out.println(s);
		}
	}	
}