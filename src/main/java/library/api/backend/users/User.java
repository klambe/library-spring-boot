package library.api.backend.users;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import library.api.backend.loans.Loan;
import library.api.backend.returns.LoanReturn;
import java.io.Serializable;



@Entity
//@Table(name="users")
public class User implements Serializable{

    @Id
    @GeneratedValue
    int id;

    String username;
    String password;
    String email;
    String role;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Loan> loans;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<LoanReturn> loanReturns;


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


}
