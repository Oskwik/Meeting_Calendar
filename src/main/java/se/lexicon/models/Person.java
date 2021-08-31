package se.lexicon.models;

import jdk.nashorn.internal.runtime.Undefined;

import java.util.Objects;

public class Person {
    // fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    // (variable access modifier) (variable type) (variable name)
    private AppUser userCredentials;

    // conscructore


    public Person(int id, String firstName, String lastName, String email, AppUser userCredentials) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userCredentials = userCredentials;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppUser getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(AppUser userCredentials) {
        this.userCredentials = userCredentials;
    }
}
