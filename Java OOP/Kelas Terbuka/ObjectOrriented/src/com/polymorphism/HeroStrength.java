package com.polymorphism;

public class HeroStrength extends HeroParent {
    String type = "Strength";

    HeroStrength(String name){
        super(name);
    }

    void showStrength(){
        System.out.println("I'm Strength Type");
    }

    public String toString(){
        return super.toString()
        + "Type : " + this.type + "\n";
    }
}