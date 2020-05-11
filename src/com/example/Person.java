package com.example;

public class Person extends BaseEntity{
    private String firstName;
    private String surname;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + super.getId() + '\'' +
                "id='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
