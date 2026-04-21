package com.example.DDLDDM.repository;

import com.example.ddlddm.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

    // Найти всех, кто живёт в MOSCOW
    @Query("SELECT p.name, p.surname FROM Person p WHERE p.cityOfLiving = 'MOSCOW'")
    List<Object[]> findMoscowResidents();

    // Найти всех старше 27, отсортировать по убыванию возраста
    @Query("SELECT p FROM Person p WHERE p.age > 27 ORDER BY p.age DESC")
    List<Person> findPersonsOlderThan27();
}
