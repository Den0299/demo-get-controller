package com.example.demo_get_controller.get_completa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2")
public class UserController {

    @GetMapping("ciao")
    public User saluto(@RequestParam String nome,
                       @RequestParam String provincia) {

        return new User(nome, provincia);
    }
}
