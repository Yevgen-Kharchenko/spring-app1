package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public  static ClassicalMusic getClassicalMusic(){
        System.out.println("factory-method return bean ");
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {

        return "Hungarian Rhapsody";
    }

    public void doMyInit(){
        System.out.println("ClassicalMusic initialisation");
    }

    public void doMyDestroy(){
        System.out.println("ClassicalMusic destroy");
    }
}
