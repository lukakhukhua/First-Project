package com.others.firstProject.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

// sudo -u postgres psql
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "REGISTRY")
public class Registry {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "RELATIVE_USER_ID")
    private long relativeUserId;

    @Transient
    private short age;

    public short getAge() {
        return (short)Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Registry other = (Registry) obj;
        return (this.id == other.id) ||
                (
                        this.firstName.equals(other.firstName) &&
                        this.lastName.equals(other.lastName) &&
                        this.age == other.age &&
                        this.relativeUserId == other.relativeUserId
                );

    }
}
