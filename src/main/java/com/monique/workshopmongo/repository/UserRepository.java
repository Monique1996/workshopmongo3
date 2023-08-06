package com.monique.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.monique.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String> {



}