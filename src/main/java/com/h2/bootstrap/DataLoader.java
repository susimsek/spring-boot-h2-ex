package com.h2.bootstrap;

import com.h2.model.Person;
import com.h2.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person1=new Person();
        person1.setName("ali");
        person1.setSurname("seker");

        Person person2=new Person();
        person2.setName("hakan");
        person2.setSurname("ergin");

        Person person3=new Person();
        person3.setName("yasin");
        person3.setSurname("simsek");

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
    }
}