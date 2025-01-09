package com.example.personsCrud.repository;

import com.example.personsCrud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
