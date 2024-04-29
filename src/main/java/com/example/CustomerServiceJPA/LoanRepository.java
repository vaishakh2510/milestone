package com.example.CustomerServiceJPA;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository

public interface  LoanRepository extends CrudRepository<Loan,Long> {

	void deleteById(int lid);
	Loan findByCustname(String custname);
	Optional<Loan> findById(int id);
	List<Loan> findById(Integer id);


}
