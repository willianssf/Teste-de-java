package entities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Livros {
	
	private int id;
	private String name;
	private Double price;
	private specifications specifications;

	public Livros() {
		
	}

	public Livros(int id, String name, Double price, entities.specifications specifications) {
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
		return "Livros [id=" + id + ", name=" + name + ", price=" + price + ", specifications=" + specifications
				+ "]";
	}
	
	public void mostra() throws FileNotFoundException {
		FileReader file = new FileReader("src\\application\\books.json");
		
		Type type = new TypeToken<List<Livros>>(){}.getType();
		
		Gson gson = new GsonBuilder().create();
		
		List<Livros> livro = gson.fromJson(file, type);
		
		for (Livros livros : livro) {
			
			System.out.println(livros.getSpecifications().getIllustrator());
		}
	      
		
	}
	

}
