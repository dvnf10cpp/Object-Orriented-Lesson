package com.basecode;

public class Adick {
    private String name;

    Adick(String name){
        this.name = name;
    }

    void halodek(){
        System.out.printf("Nama Adick : %s\n",this.name);
    }

    String getWant(){
        return this.name + " want to blow mondstadt";
    }
}
