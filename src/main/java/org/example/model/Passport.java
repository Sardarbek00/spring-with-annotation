package org.example.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Passport {
    private String name;
    private int uniqueNumber;
    @Autowired
    private Animal animal;

    public Passport(String name, int uniqueNumber) {
        this.name = name;
        this.uniqueNumber = uniqueNumber;
    }
}
