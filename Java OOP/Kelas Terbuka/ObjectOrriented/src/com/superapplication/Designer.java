package com.superapplication;

public class Designer extends Employee{
    /*
     * Ketika membuat subclass constructor dan superclass memiliki constructor
     * Panggil constructor superclass terlebih dahulu dengan super() method 
     * Didalam constructor subclass.
     * Begitu juga dengan overloading constructor
     * Ketika superclass memiliki overloading constructor, subclass jg harus membuat overloading constructor
     * Dan memanggil superclass constructor
     */
    Designer(String name, int age, String position){
        super(name,age);
    }

    //Override from Employee class
    void work(){
        super.work();
        System.out.printf("The Job is designing for this project");
    }
    
    //Overload 
    void work(String client){
        super.work();
        System.out.printf("Their client name is %s\n",client);
    }
}
