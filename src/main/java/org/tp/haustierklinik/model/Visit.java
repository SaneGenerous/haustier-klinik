package org.tp.haustierklinik.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
