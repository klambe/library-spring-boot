package library.api.backend.loans;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoanController {

    @Autowired
    private LoanService myLoanService;

    @RequestMapping(value="/loans", method = RequestMethod.GET)
    public List<Loan> getAllLoans(){return myLoanService.getAllLoans();
    }

    @RequestMapping(value="/loans/{id}", method = RequestMethod.GET)
    public Loan getLoanById(@PathVariable int id){return myLoanService.getLoan(id);
    }

    @RequestMapping(value="/loans", method = RequestMethod.POST)
    public void addLoan(Loan loan){ myLoanService.addLoan(loan);
    }
    @RequestMapping(value="/loans", method = RequestMethod.PUT)
    public void updateLoan(Loan loan){ myLoanService.updateLoan(loan);
    }

    @RequestMapping(value="/loans/{id}", method = RequestMethod.DELETE)
    public void updateLoan(@PathVariable int id){ myLoanService.deleteLoan(id);
    }

}

