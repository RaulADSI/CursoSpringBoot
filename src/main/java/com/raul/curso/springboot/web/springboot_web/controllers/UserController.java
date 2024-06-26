package com.raul.curso.springboot.web.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

import com.raul.curso.springboot.web.springboot_web.model.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Rulo", "Torres Ramirez");
        user.setEmail("raul@mail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(new User("Pedro", "Perez"),
        new User("Cosme", "Fulanito"),
        new User("Kamba", "Del Carmen", "kamba@mail.com"));
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios!");
        return "list";
    }
}
