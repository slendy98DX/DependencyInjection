package it.develhope.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private final MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("MyService() has been called");
    }

    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }
}
