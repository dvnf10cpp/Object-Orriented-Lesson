package com.superapplication;

public class Programmer extends Student{
    String name = "Programmer";

    void display(){
        //this.name akan mengakses atribut name di kelas ini
        //tidak ada? akan loncat ke parent class

        //Jika this diganti dengan super, akan mengakses atribut parent class
        //bisa diganti this dengan super untuk demo
        System.out.printf("Class : %s\n",this.name);
        this.intro();

        System.out.printf("Class : %s\n",super.name);
        super.intro();
    }

    void intro(){
        System.out.println("I'am a programmer");
    }
}
