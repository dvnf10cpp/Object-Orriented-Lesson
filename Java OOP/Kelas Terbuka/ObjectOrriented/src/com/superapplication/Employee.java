package com.superapplication;

public class Employee {
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work(){
        System.out.printf("%s is working on their job\n",this.name);
    }
}
