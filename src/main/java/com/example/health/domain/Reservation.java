package com.example.health.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {

    private final String id;
    private User user; // Relación con el usuario que hace la reserva
    private LocalDateTime dateTime;
    private String description;

    public Reservation(User user, LocalDateTime dateTime, String description) {
        this(UUID.randomUUID().toString(), user, dateTime, description);
    }

    public Reservation(String id, User user, LocalDateTime dateTime, String description) {
        if (user == null) throw new IllegalArgumentException("User is required");
        if (dateTime == null) throw new IllegalArgumentException("DateTime is required");

        this.id = id;
        this.user = user;
        this.dateTime = dateTime;
        this.description = description;
    }

    // Getters
    public String getId() { return id; }
    public User getUser() { return user; }
    public LocalDateTime getDateTime() { return dateTime; }
    public String getDescription() { return description; }

    // Setters
    public void setUser(User user) { this.user = user; }
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Reservation{" +
                "id='" + id + '\'' +
                ", user=" + user.getName() + " " + user.getLastName() +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }
}
