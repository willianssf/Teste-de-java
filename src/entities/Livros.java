package entities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Livros<T> {
	private int id;
	private String name;
	private Double price;
	private specifications specifications;

	public Livros() {

	}

	public Livros(int id, String name, Double price, specifications specifications) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.specifications = specifications;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public specifications getSpecifications() {
		return specifications;
	}

	public void setSpecifications(specifications specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "Livros \n"
				+ "[id=" + id  
				+ ", name=" + name 
				+ ", price=" + price 
				+ ", specifications=" + specifications 
				+ "]";
	}
	

	public void mostra(T e) throws FileNotFoundException {
		
		FileReader file = new FileReader("src\\application\\books.json");

		Type type = new TypeToken<List<Livros>>() {}.getType();

		Gson gson = new Gson();
		
		List<Livros> livro = gson.fromJson(file, type);	
		
		//System.out.println(livro.get(2).getSpecifications().getAuthor());

		for(int i = 0; i < livro.size(); i++) {	
			if(livro.get(i).getPrice().equals(e)) {
				System.out.println(livro.get(i).getId());
		}
			if(livro.get(i).getName().equals(e)) {
				System.out.println(livro.get(i).getId());
			}
			if (livro.get(i).getSpecifications().getAuthor().equals(e)) {
				System.out.println(livro.get(i).getId());	
			}
		}
	}
}
