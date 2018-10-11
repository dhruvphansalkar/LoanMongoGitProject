package com.proj.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.proj.beans.LoanApplication;


public interface LoanApplicationDao extends MongoRepository<LoanApplication,Integer>
{

}
