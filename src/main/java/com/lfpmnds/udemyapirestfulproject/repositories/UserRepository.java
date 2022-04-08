package com.lfpmnds.udemyapirestfulproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lfpmnds.udemyapirestfulproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
