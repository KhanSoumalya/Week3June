package com.nit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Debanjan;


@Repository
public interface DebanjanRepo extends MongoRepository<Debanjan, Integer>{

}
