package com.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    //@GetMapping("/hello")
    public String sayHello() {
        return "Hey this is GET method sayHello";
    }
    @GetMapping("/hello-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2() {
        return "Hey this is GET method sayHello-2 ";
    }

    @PostMapping("/post")
    public String PostMapping(@RequestBody String str) {

        return "Hey this is GET method sayHello-2= "+str;
    }

    @PostMapping("/post-order")
    public String PostMapping(@RequestBody Order order) {

        return "Hey this is GET method sayHello-2= "+order.toString();
    }

    //how to pass pathVariable
    //http://localhost:8080/hello/naveen
    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String userName) {
        return "My Value ="+userName;
    }

    //how to pass variable as request param
    //http://localhost:8080/hello?param_value=paramValue
    @GetMapping("/hello")
    public String paramVar(@RequestParam("user-name") String userName,@RequestParam("user-lastname") String userLastname) {
        return "My Value ="+userName+ " "+userLastname;
    }
}
