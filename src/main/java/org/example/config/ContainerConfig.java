package org.example.config;

import org.example.model.Animal;
import org.example.model.Passport;
import org.example.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.model")
public class ContainerConfig {
    @Bean(name = "user")
    public User getUser() {
        User user = new User("Sandra", 26, "lastName");
        return user;
    }

    @Bean(name = "animal")
    public Animal animal() {
        return new Animal("dog", 4);
    }
@Bean(name = "passport")
    public Passport passport() {
        return new Passport("foreign", 233445);
    }

}
