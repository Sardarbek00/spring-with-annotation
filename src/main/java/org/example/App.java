package org.example;

import org.example.config.ContainerConfig;
import org.example.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ContainerConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);

//        User sandra=context.getBean("user", User.class);
//
////        sandra.setName("Sandra");
////        sandra.setAge(26);
////        sandra.setLastName("lastName");
////
////        sandra.getPassport().setName("foreign");
////        sandra.getPassport().setUniqueNumber(232323);
////
////        sandra.getPassport().getAnimal().setName("dog");
////        sandra.getPassport().getAnimal().setAge(4);
////        System.out.println(sandra);

    }
}
