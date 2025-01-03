package com.prabhu.SampleDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                     //annotation used for controller. Tells spring to initialize controller as the application starts automatically.
public class HelloController {

    //GET call -> /hello => get 'Hello World' with http status code '200 ok'
    @GetMapping("/hello")
    public ResponseEntity helloWorld(){         //ResponseEntity to return http status
        String hello = "Hello World";
        return ResponseEntity.ok(hello);        //will wrap the hello string with http 200 status code and return
    }

    //http://localhost:8080/hello
}
