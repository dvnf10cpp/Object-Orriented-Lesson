package com.superapplication;

//Penerapan penggunaan super
public class Student {
    String name = "Student";

    void display(){
        System.out.printf("Class : %s\n",this.name);
    }

    void intro(){
        System.out.println("I'am a student");
    }
}
