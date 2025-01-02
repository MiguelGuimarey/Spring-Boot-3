package com.miguel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.curso.springboot.webapp.springboot_web.models.User;
import com.miguel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @RequestMapping(path = "/details", method = RequestMethod.GET)
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Miguel", "Guimarey");

        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("Pepito", "Los Palotes");
        User user2 = new User("Juan", "Alcatraz");
        User user3 = new User("Rickinillo", "Sanchez");
        return Arrays.asList(user1, user2, user3);
    }

}
