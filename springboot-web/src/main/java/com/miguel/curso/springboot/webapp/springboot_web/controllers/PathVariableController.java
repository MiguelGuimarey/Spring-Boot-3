package com.miguel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.curso.springboot.webapp.springboot_web.models.User;
import com.miguel.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.userName}")
    private String userName;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}")
    private Integer code;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {

        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // Guardar en BBDD
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("userName", userName);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("code", code);

        return json;
    }

}
