package bookstore;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "title", length = 50)
	protected String title;
	
	@Column(name = "genre", length = 50)
	protected String genre;
	
	@Column(name = "author", length = 50)
	protected Author author;
	
	@Column(name = "format", length = 50)
	protected String format;

	public Book(String title, String genre, Author author, String format) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.format = format;
	}
	
	public Book(){
		
	}

	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	
	
	
	

}
