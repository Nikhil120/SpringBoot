package com.example.bootstrap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootstrap.entity.Dog;
import com.example.bootstrap.repository.DogRepository;


@Service
public class DogServiceImpl implements DogService {
	@Autowired
	DogRepository dogRepository;

	@Override
	public List<Dog> retrieveDogs() {
		return (List<Dog>) dogRepository.findAll();
	}

	@Override
	public List<String> retrieveDogBreed() {
		return (List<String>) dogRepository.findAllBreed();
	}

	@Override
	public String retrieveDogBreedById(Long id) {
		Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
		String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
		return breed;
	}

	@Override
	public List<String> retrieveDogNames() {
		return (List<String>) dogRepository.findAllName();
	}

}
