package com.example.demo_get_controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class SalutoController {

    @GetMapping("ciao")
    public ResponseEntity<String> saluto(@RequestParam String nome,
                                         @RequestParam String provincia) {

        return ResponseEntity.ok("Ciao " + nome + ", com'è il tempo in " + provincia + "?");
    }
}
