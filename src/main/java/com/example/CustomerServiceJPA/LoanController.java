package com.example.CustomerServiceJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoanController {
	
@Autowired
LoanService  loanserv;

@GetMapping("/getLoan")
public List<Loan> getLoanDetails(@RequestParam(required = false) Integer id) {
    if (id != null) {
        // If ID is provided, fetch loan details by ID
        return loanserv.getLoanById(id);
    	
    } else {
        // If no ID is provided, fetch all loan details
        return loanserv.getAllLoan();
    }
}



@GetMapping(path = "/Newloan")
public String saveloanDetails(@RequestParam int Id,
                               @RequestParam String custname,
                               @RequestParam String custContact,
                               @RequestParam String loanType,
                               @RequestParam Float loanamount) {
    return loanserv.Newloan(Id, custname, custContact, loanType, loanamount);
}

@GetMapping("/deleteCust")
public String deletecust(@RequestParam int id) {

return loanserv.deleteById(id);

}
@GetMapping(path = "/updateCustomer")
public String updateCustomerById(@RequestParam int id,
                                  @RequestParam(required = false) String custname,
                                  @RequestParam(required = false) String custContact,
                                  @RequestParam(required = false) String loanType,
                                  @RequestParam(required = false) Float loanamount) {
    // Perform update based on provided parameters
    return loanserv.updateCustomer(id, custname, custContact, loanType, loanamount);
}



}
