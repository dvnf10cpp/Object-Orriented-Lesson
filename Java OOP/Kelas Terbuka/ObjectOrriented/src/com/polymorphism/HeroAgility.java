package com.polymorphism;

public class HeroAgility extends HeroParent {
    String type = "Agility";

    HeroAgility(String name){
        super(name);
    }

    void showAgility(){
        System.out.println("I'm Agility");
    }

    public String toString(){
        return super.toString()
        + "Type : " + this.type + "\n";
    }
}
