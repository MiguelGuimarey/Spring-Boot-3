package com.miguel.curso.springboot.webapp.springboot_web.controllers;

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

}
