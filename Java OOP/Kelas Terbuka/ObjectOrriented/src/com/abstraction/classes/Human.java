package com.abstraction.classes;

//Abstract class
public abstract class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public void display(){
        System.out.printf("I'm %s\n",this.name);
    }

    //Abstract Method
    public abstract void think();

    //Setter And Getter
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
