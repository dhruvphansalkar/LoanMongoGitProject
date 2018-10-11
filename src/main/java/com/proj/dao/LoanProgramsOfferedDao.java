package com.proj.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.proj.beans.LoanProgramsOffered;

public interface LoanProgramsOfferedDao extends MongoRepository<LoanProgramsOffered, String> 
{

}
