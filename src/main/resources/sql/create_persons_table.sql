CREATE TABLE PERSONS (
name VARCHAR(25) NOT NULL,
surname VARCHAR (30) NOT NUll,
age INT NOT NULL,
phone_number VARCHAR(12),
city_of_living VARCHAR(25),
PRIMARY KEY(name, surname, age)
);