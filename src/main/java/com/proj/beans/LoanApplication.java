package com.proj.beans;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="LoanApplication")
public class LoanApplication 
{
	@Id
	int applicationId;
	Date applicationDate;
	String loanProgram;
	int amountOfLoan;
	String addressOfProperty;
	int annualFamilyIncome;
	String documentProofsAvailable;
	String guaranteeCover;
	int marketValueOfGuaranteeCover;
	String status;
	Date dateOfInterview;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getLoanProgram() {
		return loanProgram;
	}
	public void setLoanProgram(String loanProgram) {
		this.loanProgram = loanProgram;
	}
	public int getAmountOfLoan() {
		return amountOfLoan;
	}
	public void setAmountOfLoan(int amountOfLoan) {
		this.amountOfLoan = amountOfLoan;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public int getAnnualFamilyIncome() {
		return annualFamilyIncome;
	}
	public void setAnnualFamilyIncome(int annualFamilyIncome) {
		this.annualFamilyIncome = annualFamilyIncome;
	}
	public String getDocumentProofsAvailable() {
		return documentProofsAvailable;
	}
	public void setDocumentProofsAvailable(String documentProofsAvailable) {
		this.documentProofsAvailable = documentProofsAvailable;
	}
	public String getGuaranteeCover() {
		return guaranteeCover;
	}
	public void setGuaranteeCover(String guaranteeCover) {
		this.guaranteeCover = guaranteeCover;
	}
	public int getMarketValueOfGuaranteeCover() {
		return marketValueOfGuaranteeCover;
	}
	public void setMarketValueOfGuaranteeCover(int marketValueOfGuaranteeCover) {
		this.marketValueOfGuaranteeCover = marketValueOfGuaranteeCover;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfInterview() {
		return dateOfInterview;
	}
	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}

	
}
