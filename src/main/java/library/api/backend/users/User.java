package library.api.backend.users;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import library.api.backend.loans.Loan;
import library.api.backend.returns.LoanReturn;


@Entity
@Table(name="users")
public class User {

    @Id
    int id;

    String username;
    String password;
    String email;
    String role;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "loan",fetch = FetchType.EAGER)
    private List<Loan> loan;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "loan",fetch = FetchType.EAGER)
    private List<LoanReturn> loanReturn;


    public User() {
    }

    public User(int id, String username, String password, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Loan> getLoan() {
        return loan;
    }

    public void setLoan(List<Loan> loan) {
        this.loan = loan;
    }

    public List<LoanReturn> getLoanReturn() {
        return loanReturn;
    }

    public void setLoanReturn(List<LoanReturn> loanReturn) {
        this.loanReturn = loanReturn;
    }
}
