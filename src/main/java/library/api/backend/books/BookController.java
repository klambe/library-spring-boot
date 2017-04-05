package library.api.backend.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookController {
	@Autowired
	private BookService myBookService;
	
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<Book> getBooks(){
		return myBookService.getAllBooks();
	}
	
	@RequestMapping(value="/books/{id}", method = RequestMethod.GET)
	public Book getBooksById(@PathVariable int id){
		return myBookService.getBook(id);
	}
	
	@RequestMapping(value="/books", method = RequestMethod.POST)
	public void createBook(@RequestBody Book book){
		myBookService.addBook(book);
	}
	
	@RequestMapping(value="/books/{id}", method = RequestMethod.PUT)
	public void updateBook(@RequestBody Book book,@PathVariable int id){
		 myBookService.updateBook(book, id);
	}

	@RequestMapping(value="/books/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable int id){
		 myBookService.deleteBook(id);
	}

}
