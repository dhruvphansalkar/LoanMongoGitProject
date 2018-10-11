package com.proj.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="ApprovedLoans")
public class ApprovedLoans 
{
	@Id
	int applicationId;
	String customerName;
	double amountOfLoanGranted;
	double monthlyInstallment;
	int yearsTimeperiod;
	double downpayment;
	double rateOfInterest;
	double totalAmountPayable;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmountOfLoanGranted() {
		return amountOfLoanGranted;
	}
	public void setAmountOfLoanGranted(double amountOfLoanGranted) {
		this.amountOfLoanGranted = amountOfLoanGranted;
	}
	public double getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(double monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	public int getYearsTimeperiod() {
		return yearsTimeperiod;
	}
	public void setYearsTimeperiod(int yearsTimeperiod) {
		this.yearsTimeperiod = yearsTimeperiod;
	}
	public double getDownpayment() {
		return downpayment;
	}
	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getTotalAmountPayable() {
		return totalAmountPayable;
	}
	public void setTotalAmountPayable(double totalAmountPayable) {
		this.totalAmountPayable = totalAmountPayable;
	}
	
	
}
