package entities;

import com.google.gson.annotations.SerializedName;

public class specifications<T>{
	
	@SerializedName(value="Originally published",alternate = "originallyPublished")
	private String originallyPublished;
	private String Author;
	
	@SerializedName(value = "Page count", alternate = "pageCount")
	private int pageCount;
	private T Illustrator;
	private T Genres;

	public specifications( String originallyPublished, String author, int pageCount, T illustrator, T genres) {
		this.originallyPublished = originallyPublished;
		Author = author;
		this.pageCount = pageCount;
		Illustrator = illustrator;
		Genres = genres;
	}
	
	public String getOriginallyPublished() {
		return originallyPublished;
	}

	public void setOriginallyPublished(String originallyPublished) {
		this.originallyPublished = originallyPublished;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int page) {
		pageCount = page;
	}

	public T getIllustrator() {
		return Illustrator;
	}

	public void setIllustrator(T illustrator) {
		Illustrator = illustrator;
	}
	
	public T getGenres() {
		return Genres;
	}

	public void setGenres(T genres) {
			Genres = genres;
	}

	@Override
	public String toString() {
		return "\n Originally Published: " + originallyPublished 
				+ " Author: " + Author + "\n" 
				+ " Page Count: " + pageCount + "\n"
				+ " Genres: " + Genres + "\n";
	}

}