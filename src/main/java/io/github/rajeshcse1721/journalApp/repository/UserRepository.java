package io.github.rajeshcse1721.journalApp.repository;

import io.github.rajeshcse1721.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User , ObjectId> {
    User findByUserName(String username);

}
