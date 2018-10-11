package com.proj.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.proj.beans.EndUsers;

public interface EndUsersDao extends MongoRepository<EndUsers,String> 
{

}
