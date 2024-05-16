package com.others.firstProject.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "REGISTRY_USER")
public class RegistryUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "REG_ID")
    private long RegId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "DESCRIPTION")
    private String description;

    @Transient
    private short age;

    public short getAge() {
        return (short) Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        RegistryUser other = (RegistryUser) obj;
        return this.RegId == other.RegId;
    }
}
