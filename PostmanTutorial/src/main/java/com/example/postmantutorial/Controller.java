package com.example.postmantutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/Get")

    void getBody(@RequestBody Person ob) {

        // Print and display the person object
        System.out.println(ob);
    }
}