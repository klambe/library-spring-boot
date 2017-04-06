package library.api.backend.books;

import javax.persistence.Entity;
import javax.persistence.*;
import library.api.backend.loans.Loan;

import library.api.backend.returns.LoanReturn;

import java.io.Serializable;
import java.util.List;
import java.util.Set;



@Entity
//@Table(name="books")
public class Book implements Serializable {

	@Id
	@GeneratedValue
	int id;
	
	String isbn;
	String author;
	String edition;
	String publisher;
	String publishDate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	private Set<Loan> loans;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	private Set<LoanReturn> loanReturns;
	
	
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
