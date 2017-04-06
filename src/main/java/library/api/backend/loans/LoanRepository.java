package library.api.backend.loans;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by cintec on 06/04/2017.
 */
public interface LoanRepository extends CrudRepository<Loan, Integer> {
}
