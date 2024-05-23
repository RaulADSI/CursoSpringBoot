package com.raul.curso.springboot.web.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.curso.springboot.web.springboot_web.model.User;
import com.raul.curso.springboot.web.springboot_web.model.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Rulo", "Torres Ramirez");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Rulo", "Torres Ramirez");
        User user1 = new User("Cosme", "Fulanito");
        User user2 = new User("Aquiles", "Brinco");

        List<User> users = Arrays.asList(user, user1, user2);

        /*
         * List<User> users = new ArrayList<>();
         * users.add(user);
         * users.add(user1);
         * users.add(user2);
         */
        return users;
    }
}
