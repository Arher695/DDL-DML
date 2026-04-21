package model;

import java.io.Serializable;
import java.util.Objects;

public class PersonKey implements Serializable {
    private String name;
    private String surname;
    private Integer age;

    // Конструкторы, equals, hashCode

    public PersonKey() {}

    public PersonKey(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonKey personKey = (PersonKey) o;
        return Objects.equals(name, personKey.name) &&
                Objects.equals(surname, personKey.surname) &&
                Objects.equals(age, personKey.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
