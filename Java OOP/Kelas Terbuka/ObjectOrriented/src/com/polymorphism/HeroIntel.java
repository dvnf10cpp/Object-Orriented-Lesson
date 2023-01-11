package com.polymorphism;

public class HeroIntel extends HeroParent {
    String type = "Intel";

    HeroIntel(String name){
        super(name);
    }

    void showIntel(){
        System.out.println("I'm Intel ");
    }

    public String toString(){
        return super.toString()
        + "Type : " + this.type + "\n";
    }
}
