package library.api.backend.loans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoanService {

    @Autowired
    private LoanRepository myLoanRepository;

    public List<Loan> getAllLoans(){
        List<Loan> myLoans = new ArrayList<>();

        myLoanRepository.findAll().forEach(myLoans::add);
        return myLoans;

    }

    public Loan getLoan(int id){return myLoanRepository.findOne(id);}

    public void addLoan(Loan loan){myLoanRepository.save(loan);}
    public void updateLoan(Loan loan){myLoanRepository.save(loan);}
    public void deleteLoan(int id){myLoanRepository.delete(id);}


}
