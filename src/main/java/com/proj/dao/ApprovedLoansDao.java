package com.proj.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.beans.ApprovedLoans;

public interface ApprovedLoansDao extends MongoRepository<ApprovedLoans,Integer> 
{

}
