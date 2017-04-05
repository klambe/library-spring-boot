package library.api.backend.loans;

import library.api.backend.books.Book;
import library.api.backend.users.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//
//@Entity
//@Table(name="users")
public class Loan {

//    @Id
//    int id;
//
//
//    Book book;
//    User user;
@CreationTimestamp
private Date created;
//
//    String initialLoanDate;
//    String dueDate;
}
