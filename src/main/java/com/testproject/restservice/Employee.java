package com.testproject.restservice;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String surName;
    private String emailAddress;

    Employee() {}

    Employee(String firstName, String surName, String emailAddress) {

        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.surName;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.surName, employee.surName)
                && Objects.equals(this.emailAddress, employee.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.surName, this.emailAddress);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", surName='" + this.surName + '\'' + ", emailAddress='" + this.emailAddress + '\'' + '}';
    }
}