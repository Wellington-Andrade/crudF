package com.br.crud.service;

import java.util.List;

import com.br.crud.model.Person;
import com.br.crud.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){       
        return personRepository.findAll();
    }

    public void create(Person person){
        person.setEnabled(true);
        personRepository.save(person);
    }

}
