package com.antuneseric.workshopspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.antuneseric.workshopspring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
