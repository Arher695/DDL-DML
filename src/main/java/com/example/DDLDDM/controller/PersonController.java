package com.example.DDLDDM.controller;

import com.example.ddlddm.model.Person;
import com.example.ddlddm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    // GET /persons/moscow
    @GetMapping("/persons/moscow")
    public List<NameSurname> getMoscowResidents() {
        return personRepository.findMoscowResidents().stream()
                .map(row -> new NameSurname((String) row[0], (String) row[1]))
                .collect(Collectors.toList());
    }

    // GET /persons/older-than-27
    @GetMapping("/persons/older-than-27")
    public List<Person> getPersonsOlderThan27() {
        return personRepository.findPersonsOlderThan27();
    }

    // Вспомогательный класс для возврата имени и фамилии
    public static class NameSurname {
        private String name;
        private String surname;

        public NameSurname(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
    }
}
