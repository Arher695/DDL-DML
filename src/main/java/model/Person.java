package model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "PERSONS")
@IdClass(model.PersonKey.class)
public class Person {

    @Id
    @Column(name = "name", length = 25, nullable = false)
    private String name;

    @Id
    @Column(name = "surname", length = 30, nullable = false)
    private String surname;

    @Id
    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "phone_number", length = 12)
    private String phoneNumber;

    @Column(name = "city_of_living", length = 25)
    private String cityOfLiving;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }
}

