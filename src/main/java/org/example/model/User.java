package org.example.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private int age;
    private String lastName;
    @Autowired
    private Passport passport;

    public User(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }
}
