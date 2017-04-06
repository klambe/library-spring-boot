package library.api.backend.returns;

import library.api.backend.books.Book;
import library.api.backend.users.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book_return")
public class LoanReturn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;


    @CreationTimestamp
    private Date dateOfReturn;

    @CreationTimestamp
    private Date dateOfIssue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;


    public LoanReturn() {
    }

    public LoanReturn(int id,  Date dateOfReturn, Date dateOfIssue) {
        this.id = id;

        this.dateOfReturn = dateOfReturn;
        this.dateOfIssue = dateOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
