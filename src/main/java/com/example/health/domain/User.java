package com.example.health.domain;

import java.util.Objects;
import java.util.UUID;

public class User {

    private final String id;
    private String name;
    private String lastName;
    private String email;
    private String mobileNumber;

    public User(String name, String lastName, String email, String mobileNumber) {
        this(UUID.randomUUID().toString(), name, lastName, email, mobileNumber);
    }

    public User(String id, String name, String lastName, String email, String mobileNumber) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        if (lastName == null || lastName.isBlank()) throw new IllegalArgumentException("lastName is required");
        if (email == null || email.isBlank()) throw new IllegalArgumentException("email is required");
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // Getters & setters (solo en campos editables)
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { if (name == null || name.isBlank()) throw new IllegalArgumentException("name"); this.name = name; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { if (lastName == null || lastName.isBlank()) throw new IllegalArgumentException("lastName"); this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { if (email == null || email.isBlank()) throw new IllegalArgumentException("email"); this.email = email; }
    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
    @Override public int hashCode() { return Objects.hash(id); }

    @Override public String toString() {
        return "User{id='" + id + "', name='" + name + "', lastName='" + lastName + "', email='" + email + "'}";
    }
}
