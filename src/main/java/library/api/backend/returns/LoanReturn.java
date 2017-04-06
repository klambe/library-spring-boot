package library.api.backend.returns;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book_return")
public class LoanReturn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    int userId;

    int bookId;


    @CreationTimestamp
    private Date dateOfReturn;

    @CreationTimestamp
    private Date dateOfIssue;

    public LoanReturn() {
    }

    public LoanReturn(int id, int userId, int bookId, Date dateOfReturn, Date dateOfIssue) {
        this.id = id;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
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
