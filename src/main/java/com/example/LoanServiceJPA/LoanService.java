package com.example.LoanServiceJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.transaction.Transactional;


@Service
public class LoanService {
	
	@Autowired
	LoanRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;

	public List<Loan> getAllLoan() {
		
		List<Loan> list = (List)repo.findAll();
		return list;
	}

	public String Newloan(int Id,String custname, String custContact,String loanType,Float loanamount) {
		Loan c1 = new Loan();
		c1.setId(Id);
		c1.setCustname(custname);
		c1.setCustContact(custContact);
		c1.setLoanType(loanType);
		c1.setLoanamount(loanamount);
		repo.save(c1);
		return "Data Saved Successfully!";
	}
	@Transactional
	public String deleteById(int lid) {
      // Delete customer by loanid
		repo.deleteById(lid);
        return "Data Deleted Successfully!";
    }
	@Transactional
	public String updateCustomer(int id, String custname, String custContact, String loanType, Float loanamount) {
        // Retrieve the customer entity from the repository
        Optional<Loan> optionalLoan = repo.findById(id);

        if (optionalLoan.isPresent()) {
            Loan loan = optionalLoan.get();

            // Update the customer fields if they are provided
            if (custname != null) {
                loan.setCustname(custname);
            }
            if (custContact != null) {
                loan.setCustContact(custContact);
            }
            if (loanType != null) {
                loan.setLoanType(loanType);
            }
            if (loanamount != null) {
                loan.setLoanamount(loanamount);
            }

            // Save the updated customer entity
            repo.save(loan);

            return "Loan " + id + " updated successfully.";
        } else {
            return "Loan Id:" + id + " not found.";
        }
    }

	public List<Loan> getLoanById(Integer id) {
		return repo.findById(id);
	}


}
