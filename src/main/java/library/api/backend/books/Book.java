package library.api.backend.books;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	int id;
	
	String isbn;
	String author;
	String edition;
	String publisher;
	String publishDate;
	
	
	public Book() {
	}


	public Book(int id, String isbn, String author, String edition, String publisher, String publishDate) {
		this.id = id;
		this.isbn = isbn;
		this.author = author;
		this.edition = edition;
		this.publisher = publisher;
		this.publishDate = publishDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getEdition() {
		return edition;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
	

}
