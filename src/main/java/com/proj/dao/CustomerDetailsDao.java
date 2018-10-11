package com.proj.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.beans.CustomerDetails;

public interface CustomerDetailsDao extends MongoRepository<CustomerDetails,Integer> 
{

}
