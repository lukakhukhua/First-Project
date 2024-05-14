package com.others.firstProject.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Registry {

    private long id;

    private String firstName;

    private String lastName;

    private short age;

}
