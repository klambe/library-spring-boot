package library.api.backend.returns;

import library.api.backend.books.Book;
import library.api.backend.users.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;


@Entity
//@Table(name="book_return")
public class LoanReturn implements Serializable{

    @Id
    @GeneratedValue
    int id;


    @CreationTimestamp
    private Date dateOfReturn;

    @CreationTimestamp
    private Date dateOfIssue;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Book book;


    public LoanReturn() {
    }

    public LoanReturn(Date dateOfReturn, Date dateOfIssue, User user, Book book) {
        this.dateOfReturn = dateOfReturn;
        this.dateOfIssue = dateOfIssue;
        this.user = user;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
