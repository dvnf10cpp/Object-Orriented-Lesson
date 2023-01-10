package com.superapplication;

public class MainSuper {
    public static void main(String[] args) {
        demoSuperConstructor();
    }

    static void demoSuperConstructor(){
        Employee employee1 = new Employee("Axel",19);
        Designer designer1 = new Designer("John",22,"Lead Division");

        employee1.work();
        designer1.work();
    }

    static void demoSuper(){
        Student student1 = new Student();
        Programmer programmer1 = new Programmer();

        student1.display();
        programmer1.display();
    }
}
