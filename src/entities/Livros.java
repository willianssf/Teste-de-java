package entities;

@SuppressWarnings("rawtypes")
public class Livros<T> implements Comparable<Livros> {
	private int id;
	private String name;
	private String price;
	private specifications<?> specifications;
	
	public Livros() {
	}

	public Livros(int id, String name, String price, specifications<?> specifications) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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

	@Override
	public int compareTo(Livros o) {
		return price.compareTo(o.getPrice());
	}
}
