package library.api.backend.loans;

import library.api.backend.books.Book;
import library.api.backend.users.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;


import java.util.Date;


@Entity
@Table(name="book_loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private User userId;

    @ManyToOne
    private Book bookId;


    @CreationTimestamp
    private Date dateOfReturn;

    @CreationTimestamp
    private Date dateOfIssue;

    public Loan() {
    }

    public Loan(User userId, Book bookId, Date dateOfReturn, Date dateOfIssue) {
        this.userId = userId;
        this.bookId = bookId;
        this.dateOfReturn = dateOfReturn;
        this.dateOfIssue = dateOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}
