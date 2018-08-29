package io.motolola.standaloneactiveMQ.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("home/{id}")
    public String myHome(@PathVariable("id") final int id)
    {
        return "Your ID is: "+id;
    }


}
