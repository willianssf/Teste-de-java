package entities;

public class Livros<T> {
	private int id;
	private String name;
	private Double price;
	private specifications<?> specifications;
	
	public Livros() {
	}

	public Livros(int id, String name, Double price, specifications<?> specifications) {
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

	public specifications<?> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(specifications<?> specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "Livro \n" 
				+ " Name: " + name +"\n"
				+ " Price: " + price  +"\n"
				+ " Specifications: " + specifications;
	}
}
