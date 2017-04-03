package library.api.backend.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService {
	
	@Autowired
	private BookRepository myBookRepository;
	
	public List<Book> getAllBooks(){
		List<Book> myBooks = new ArrayList<>();
		myBookRepository.findAll()
				.forEach(myBooks::add);//lambda expression
		 return myBooks;
	}

	public void addBook(Book book) {
		myBookRepository.save(book);
		
	}

	public Book getBook(int id) {
		return myBookRepository.findOne(id);
	}

	public void updateBook(Book book, int id) {
		myBookRepository.save(book);
		}

	public void deleteBook(int id) {
		myBookRepository.delete(id);
		
	}

}
