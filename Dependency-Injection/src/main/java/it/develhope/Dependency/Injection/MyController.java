package it.develhope.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    public MyService myService;

    @Autowired
    public MyController(){
        System.out.println("MyController() has been called");
    }

    @GetMapping("/getName")
    public String getNameService(){
        return myService.getName();
    }

    @GetMapping("/")
    public void welcome(){
        System.out.println("Welcome!");
        System.out.println("MyController.welcome() has been called");
    }
}
