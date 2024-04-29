package com.example.CustomerServiceJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loan {
    
	@Id
	private int id;
	

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAccount() {
		return loanType;
	}

	public void setAccount(String LoanType) {
		this.loanType = LoanType;
	}

		private String custname;
		private String custContact;


		public String getCustContact() {
			return custContact;
		}

		public void setCustContact(String custContact) {
			this.custContact = custContact;
		}

		public String getLoanType() {
			return loanType;
		}

		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}

		public Float getLoanamount() {
			return loanamount;
		}

		public void setLoanamount(Float loanamount) {
			this.loanamount = loanamount;
		}

		private String loanType;
		
		private Float loanamount;
		
}
