package com.abstraction.classes;

//Inheritance dari abstract class
public class Police extends Human {
    public Police(String name){
        super(name);
    }

    public void think(){
        System.out.println("I'm thinking of making my name popular");   
    }
}
