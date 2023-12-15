package com.Application.SportsResult.core.repository;

import com.Application.SportsResult.core.model.User;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

//    @Aggregation(pipeline = """
//        { $match: { _id: { $exists: true } } }
//    """)
//    List<User>findAllCustom();
    @Query(value="{email: '?0'}", fields="{'id': 1, 'name': 1, 'lastname':1, 'username': 1, 'userType': 1}")
    Optional <User> findByEmailCustom(String email);
    Optional<User> findById(String id);
    Optional<User> findByUsername(String username);


}
