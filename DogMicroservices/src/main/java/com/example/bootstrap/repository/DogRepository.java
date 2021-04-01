package com.example.bootstrap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bootstrap.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {
	
}
