package com.miguel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguel.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Miguel", "Guimarey");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        User user = new User("Miguel", "Guimarey", "email@correo.com");
        User user2 = new User("Pepa", "La Cerda");
        User user3 = new User("Juan", "Mahoraga", "mahoraga@correo.com");

        List<User> users = Arrays.asList(user, user2, user3);
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }
}
