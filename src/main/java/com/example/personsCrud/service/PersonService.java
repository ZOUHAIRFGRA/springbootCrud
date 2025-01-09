package com.example.personsCrud.service;

import com.example.personsCrud.model.Person;
import com.example.personsCrud.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person updatePerson(Long id, Person person) {
        person.setId(id);
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
