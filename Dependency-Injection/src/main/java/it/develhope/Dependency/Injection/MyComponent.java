package it.develhope.Dependency.Injection;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String myComponentName;

    public MyComponent(){
        this.myComponentName = "Marco";
        System.out.println("MyComponent() has been called");
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}
